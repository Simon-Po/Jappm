package jappm.shapes;

import jappm.JColor;

public class Rect extends Shape {




    public Rect(int[] points, JColor color) {
         if(testPoints(points)){
            this.points = points;
            this.lineColor = color;
         }

    }


    @Override
    void draw() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void fill(JColor color) {
        // TODO Auto-generated method stub
        
    }

    boolean testPoints(int[] points) {
        if(points.length > 4) {
            throw new Error("ERROR: Rect can only have 2 points (x1,y1,x2,y2)");
            
        }else if(points.length < 4) {
            throw new Error("ERROR: Rect needs to have 2 points (x1,y1,x2,y2)");
            
        }else {
            return true;
        }
    }
    
}
