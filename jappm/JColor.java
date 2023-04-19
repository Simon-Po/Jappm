package jappm;

public class JColor {
    private int red;
    private int green;


    private int blue;

    public JColor(int r, int g, int b) {
        this.red = r;
        this.green = g;
        this.blue = b;
    }

    public int[] getColor() {
        return new int[] {this.red,this.green,this.blue};
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
}
