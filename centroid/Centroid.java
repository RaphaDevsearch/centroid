package centroid;
import java.util.ArrayList;
public class Centroid {
    // tableau of point or Object
    ArrayList <Point> pts = new ArrayList<>();
    Point centroid = new Point(0, 0, 0);

    // Centroid point G
    public Centroid (ArrayList <Point> pts){
        this.pts = pts;
    }
    private double computW(){
        double sum_w = 0;
        for(Point p : pts){
            sum_w += p.weight;
        }
        return sum_w;
    }
    private double computX(){
        double sum_wx = 0;
        
        for(Point p : pts){
            sum_wx += p.x * p.weight;
        }


        return sum_wx/this.computW();

    }
    private double computY(){

        double sum_wy = 0;
        
        for(Point p : pts){
            sum_wy += p.y * p.weight;
        }


        return sum_wy/this.computW();

    }
    public Point getCentroid(){

        // set x centroid
        // this.centroid.x = this.computX();
        // this.centroid.y = this.computY();
        // this.centroid.weight = this.computW();        
        // set y centroid
        // set weight
        
        return new Point(this.computX(), this.computY(), this.computW());
    }

    // get centroid : return the point unique
    // display G herit the Point object
}
