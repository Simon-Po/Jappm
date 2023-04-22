package jappm;


public class App {
    
    public static void main(String[] args) {

    
    Jappm img = new Jappm("BresenhamLine",100,100);
    
    img.fillImg(new JColor(0, 0,0));
    
  
    img.drawLine(10, 10, 10, 80, new JColor(0,255,0) );
    img.drawLine(10, 10, 25, 20, new JColor(0,255,0) );
    img.drawLine(25, 20, 10, 40, new JColor(0,255,0) );
    img.drawLine(10, 40, 25, 80, new JColor(0,255,0) );
    

    img.drawLine(30, 80, 30, 40, new JColor(0,255,0) );
    img.drawLine(30, 10, 30, 20, new JColor(0,255,0) );

    img.drawLine(45, 20, 45, 80, new JColor(0,255,0) );
    img.drawLine(35, 40, 55, 40, new JColor(0,255,0) );

    img.drawLine(55, 80, 65, 10, new JColor(0,255,0) );
    img.drawLine(75, 80, 65, 10, new JColor(0,255,0) );
    img.drawLine(55, 45, 75, 45, new JColor(0,255,0) );

    img.writePixelBufferToFile();
    
    
    


}


}