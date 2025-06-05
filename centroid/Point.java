package centroid;

public class Point {
    double x;
    double y;
    double weight;
    public Point(double x, double y, double weight){
        this.x = x;
        this.y = y;
        this.weight = weight;
    }
    public void display(){
        System.out.println("x = " + this.x + ", y = " + this.y + ", w = " + this.weight);
    }
    // setX. setY
}
