package jappm;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Jappm {
    private int width;
    private int height;
    private int[][][] pixels;
    private String colorAscii;
    private String fileName = "out.ppm";
    
    private String pixel[];
    private String ppmStart;
    // Constructor with Filename and color
    public Jappm(int width, int height, String colorAscii, String fileName) {
        //TODO: Match color with colorfinding function for easy use
        this.width = width;
        this.height = height;
        this.colorAscii = colorAscii;
        this.fileName = fileName + ".ppm";
        fillColor(colorAscii);
    }
    // General use constructor to use Preconfigured uses
    public Jappm(String fileName,int width, int height) {
        //TODO: Match color with colorfinding function for easy use
        this.width = width;
        this.height = height;
        this.fileName = fileName + ".ppm";
    }
    // constructor with color and without filename defaults Filename to out.ppm
    public Jappm(int width, int height, String colorAscii) {
        //TODO: Match color with colorfinding function for easy use
        this.width = width;
        this.height = height;
        this.colorAscii = colorAscii;
        this.fileName = "out.ppm";
    }
    // Basic constructor without file name defaults Filename to out.ppm
    public Jappm(int width, int height) {
        this.width = width;
        this.height = height;
        this.fileName = "out.ppm";
    }

    public Jappm(int[][][] pixels,int width,int height) {
        this.pixels = pixels;
        
        this.ppmStart= "P3\n" + String.valueOf(width) + " " + String.valueOf(height) + "\n" +"255\n";
        writeToFile();
    }


    public int[][][] getPixels() {
        return this.pixels;
    }




    private void fillColor(String colorToFillImg) {
       
        this.pixel = new String[(this.width * this.height) * 3];
        
        
        int c = 0;
        for (int i = 0; i < pixel.length; i++) {
            if(c ==  1){
                tempHolder = tempHolder + colorToFillImg + " ";
                c++;
            } else if(c == 2){
                tempHolder = tempHolder + "0\n";
                c = 0;
            }else {
                tempHolder = tempHolder + "0 ";
                c++;
            }
            System.out.println("Byte written: " + String.valueOf(i));
            colorToFillImg =  String.valueOf((Integer.parseInt(colorToFillImg) >= 255) ? 0 : Integer.parseInt(colorToFillImg) + 1);
        }
        writeToFile(tempHolder);

    }
    public  void rainbow() {
       
        this.pixel = new String[(this.width * this.height) * 3];
        String greenStart = "0";
        String redStart = "120";
        String blueStart = "40";
        String tempHolder = "";
        tempHolder = tempHolder + "P3\n" + String.valueOf(this.width) + " " + String.valueOf(this.height) + "\n" +"255\n";
        int c = 0;
        for (int i = 0; i < pixel.length; i++) {
            if(c ==  1){
                tempHolder = tempHolder + greenStart + " ";
                c++;
            } else if(c == 2){
                tempHolder = tempHolder + String.format("%s\n",redStart);
                c = 0;
            }else {
                tempHolder = tempHolder + String.format("%s ", blueStart);
                c++;
            }
            System.out.println("Byte written: " + String.valueOf(i));
            greenStart =  String.valueOf((Integer.parseInt(greenStart) >= 255) ? 0 : Integer.parseInt(greenStart) + 1);
            redStart =  String.valueOf((Integer.parseInt(redStart) >= 255) ? 0 : Integer.parseInt(redStart) + 1);
            blueStart =  String.valueOf((Integer.parseInt(blueStart) >= 255) ? 0 : Integer.parseInt(blueStart) + 1);
        }
        writeToFile(tempHolder);

    }


    private void writeToFile() {
        // Creating file to be filled with contents
       createFile();
       // injecting the ppm Header into the contents string to be written to file
       String contents = ppmStart;
       int numPix = this.pixels.length * this.pixels[0].length;
       int i = 0;
       for (int[][] pixelArr1 : this.pixels) {
            for (int[] pixelArr2 : pixelArr1) {
                contents = contents + String.format("%s %s %s ",pixelArr2[0],pixelArr2[1],pixelArr2[2]);
                i++;
                System.out.println(String.format("pixel Written %s/%s",i,numPix));
                
            }
            contents = contents + "\n";
       }

       try {
        FileWriter writer = new FileWriter(this.fileName);
        writer.write( contents);
        writer.close();
        System.out.println("Written to: " + this.fileName);
       } catch (IOException e) {
        System.out.println("An Error Occoured while writing to the file");
        e.printStackTrace();
       }

    }


    private void createFile() {
        try {
        File f = new File(this.fileName);
        if (f.createNewFile()){
            System.out.println("File created: " + f.getName());
        } else {
            System.out.println("File already exists.");
        }
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
    

}
