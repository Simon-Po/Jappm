package jappm;


public class App {
    
    public static void main(String[] args) {

        Jappm j = new Jappm("CharTest", 100, 100);
        
        j.drawChar("R", 30, 4, new JColor(255, 255, 255));
        j.drawChar("i", 30 +9,4, new JColor(255, 255, 255));
        j.drawChar("t", 30 +18, 4, new JColor(255, 255, 255));
        j.drawChar("a", 30 + 9*3, 4, new JColor(255, 255, 255));


        j.drawChar("I", 10, 4 + 8, new JColor(255, 255, 255));
        j.drawChar("L", 15 +9,4 +8, new JColor(255, 50, 50));
        j.drawChar("O", 15 +18, 4 +8, new JColor(255, 100, 100));
        j.drawChar("V", 15 + 9*3, 4 +8, new JColor(255, 120, 120));
        j.drawChar("E", 15 + 9*4, 4 +8, new JColor(255, 150, 150));
        j.drawChar("Y", 50 +18, 4 +8, new JColor(255, 255, 255));
        j.drawChar("O", 50 + 9*3, 4 +8, new JColor(255, 255, 255));
        j.drawChar("U", 50 + 9*4, 4 +8, new JColor(255, 255, 255));


        j.drawLine(50, 90, 30, 50, new JColor(255, 255, 255));
        j.drawLine(50, 90, 70, 50, new JColor(255, 255, 255));

        j.drawLine(50, 50, 40, 40, new JColor(255, 255, 255));
        j.drawLine(40, 40, 30, 50, new JColor(255, 255, 255));
        
        j.drawLine(70, 50, 60, 40, new JColor(255, 255, 255));
        j.drawLine(60, 40, 50, 50, new JColor(255, 255, 255));

        j.writePixelBufferToFile();
        

    
    
    


}


}