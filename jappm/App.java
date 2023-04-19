package jappm;


public class App {
    
    public static void main(String[] args) {

    
    Jappm img = new Jappm(10,10);
    
    img.fillImg(new JColor(0, 0,0));

    int x = 2;
    int y = 2;

    img.drawPoint(x,y,new JColor(255, 0, 0));
    img.drawPoint(3, 2, new JColor(255, 255, 0));
    img.writePixelBufferToFile();
    
    
    


}


}