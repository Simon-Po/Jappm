package jappm;


public class App {
    
    public static void main(String[] args) {

    
    Jappm img = new Jappm(100,100);
    
    img.fillImg(new JColor(0, 0,0));

    int x = 2;
    int y = 2;

    
    for(int i = 0; i < 10; i++) {
        img.drawLine(x, y, x+98, y + (10* i), new JColor(255, 100*i, 0));
        img.drawLine(x, y, x + (10 * i), y + 98, new JColor(255, 100*i, 0));
    }
    img.writePixelBufferToFile();
    
    
    


}


}