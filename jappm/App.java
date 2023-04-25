package jappm;


public class App {
    
    public static void main(String[] args) {

        Chars s = new Chars();
        byte ss[] = s.getChar("");


        for (byte b : ss) {
            StringBuffer sbr = new StringBuffer(Integer.toBinaryString(((int) b) + 0x100).substring(1).replaceAll("0", " ")).reverse();
            System.out.println(sbr);
            
        }
        

    
    
    


}


}