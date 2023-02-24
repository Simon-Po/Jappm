package jappm;


public class App {


public static void main(String[] args) {
    int width = 100;
    int height = 100;
    int[][][] pixels = new int[width][height][3];

    for(int i = 0; i <  pixels.length; i++) {
        
            for (int j = 0; j < pixels[i].length; j++) {
                if(i %2 == 0 && j%2 == 0 ) {
                   for (int j2 = 0; j2 < pixels[i][j].length; j2++) {
                        pixels[i][j][j2] = 255;
                    }
                }
            }
        
    }

    

    Jappm img = new Jappm(pixels,width,height);
    
    
    


}

}