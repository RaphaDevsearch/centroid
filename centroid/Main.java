package centroid;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
    //     Point A = new Point(2, 2, 2);
    //     A.display();

        ArrayList <Point> pts = new ArrayList<>();

        pts.add(new Point(1, 2, 3));
        pts.add(new Point(4, 0, 1));
        pts.add(new Point(2, 5, 2));

        Centroid G = new Centroid(pts);

        // display each point
        for(Point p : pts){
            p.display();
        }

        G.getCentroid().display();

    }
}
