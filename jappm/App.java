package jappm;


public class App {
    
    public static void main(String[] args) {

        Jappm j = new Jappm("CharTest", 20, 20);
        j.drawLine(5, 5, 10, 10, new JColor(255, 255, 255));
        j.drawChar("A", 5, 5, new JColor(255, 255, 255));
        j.writePixelBufferToFile();
        

    
    
    


}


}