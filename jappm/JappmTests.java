package jappm;








public class JappmTests {
    
    public  JappmTests() {

        testRect();
        testChars();
        testLines();
        testPoints();


    }







    private void testRect() {
        Jappm j = new Jappm("./Tests/RectTest", 100, 100);

        j.drawRect(10, 10, 90, 90, new JColor(255, 255, 255));
        
        j.writePixelBufferToFile();
    }

    private void testPoints() {
        Jappm j = new Jappm("./Tests/PointTest", 20, 20);
    

        JColor colors[] = {new JColor(158, 1, 66),new JColor(213, 62, 79),new JColor(244, 109, 67),new JColor(253, 174, 97),new JColor(254, 224, 139),new JColor(230, 245, 152),new JColor(171, 221, 164),new JColor(102, 194, 165),new JColor(50, 136, 189),new JColor(94, 79, 162)};
    
        String firstDigitsOfPi = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094";
        
        String x[] = firstDigitsOfPi.split("");
        int xPos = 0;
        int yPos = 0;
        for (int i = 0; i < x.length -1; i++) {
            // System.out.println(x[i] + " "+ i);
            switch (x[i]) {
                case "0":
                j.drawPoint(xPos, yPos, colors[0]);        
                    break;
                case "1":
                j.drawPoint(xPos, yPos, colors[1]);
                    break;
                case "2":
                j.drawPoint(xPos, yPos, colors[2]);
                    break;
                case "3":
                j.drawPoint(xPos, yPos, colors[3]);
                    break;
                case "4":
                j.drawPoint(xPos, yPos, colors[4]);
                    break;
                case "5":
                j.drawPoint(xPos, yPos, colors[5]);
                    break;
                case "6":
                j.drawPoint(xPos, yPos, colors[6]);
                    break;
                case "7":
                j.drawPoint(xPos, yPos, colors[7]);
                    break;
                case "8":
                j.drawPoint(xPos, yPos, colors[8]);
                    break;
                case "9":
                j.drawPoint(xPos, yPos, colors[9]);
                    break;
                default:
                    break;
            }
            xPos++;
            if(xPos == 20) {
                xPos = 0;
                yPos++;
            }
        }
    
        j.writePixelBufferToFile();
            
    
        
    }


    private void testChars() {
        Jappm j = new Jappm("./Tests/CharTest", 100, 100);
        
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
        j.drawLine(50, 90, 70, 50, new JColor(255,255,255));

        j.drawLine(50, 50, 40, 40, new JColor(255, 255, 255));
        j.drawLine(40, 40, 30, 50, new JColor(255, 255, 255));
        
        j.drawLine(70, 50, 60, 40, new JColor(255, 255, 255));
        j.drawLine(60, 40, 50, 50, new JColor(255, 255, 255));

        j.writePixelBufferToFile();
    }


    private void testLines() {
        Jappm j = new Jappm("./Tests/BresenHeimLine", 100, 100);
        int startX = 10;
        int startY = 10;
        for (int i = 0; i < 8; i++) {
            j.drawLine(startX, startY, 50, 50, new JColor(255, 255, 255));
            startX = startX +10;
        }
        for (int i = 0; i < 8; i++) {
            j.drawLine(startX, startY, 50, 50, new JColor(255, 255, 255));
            startY = startY +10;
        } 
        for (int i = 0; i < 8; i++) {
            j.drawLine(startX, startY, 50, 50, new JColor(255, 255, 255));
            startX = startX -10;
        } 
        for (int i = 0; i < 8; i++) {
            j.drawLine(startX, startY, 50, 50, new JColor(255, 255, 255));
            startY = startY -10;
        } 

        
        j.writePixelBufferToFile();
    }



}
