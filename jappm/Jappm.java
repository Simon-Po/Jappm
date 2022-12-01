package jappm;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Jappm {
    private int width;
    private int height;
    private String colorAscii;
    private String fileName;
    private String ppmHeader;
    private String pixel[];
    // Constructor with Filename and color
    public Jappm(int width, int height, String colorAscii, String fileName) {
        //TODO: Match color with colorfinding function for easy use
        this.width = width;
        this.height = height;
        this.colorAscii = colorAscii;
        this.fileName = fileName + ".ppm";
        fillColor(colorAscii);
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





    private void fillColor(String colorToFillImg) {
       
        this.pixel = new String[(this.width * this.height) * 3];
        String tempHolder = "";
        tempHolder = tempHolder + "P3\n" + String.valueOf(this.width) + " " + String.valueOf(this.height) + "\n" +"255\n";
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
            
        }
        writeToFile(tempHolder);

    }


    private void writeToFile(String contents) {
       createFile();
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
