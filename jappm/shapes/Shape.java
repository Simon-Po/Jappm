package jappm.shapes;

import jappm.JColor;

public abstract class Shape {
    
    int[] points;
    JColor lineColor;



    
    abstract void fill(JColor color);

    abstract void draw();



    public int[] getPoints() {
        return points;
    }
}
