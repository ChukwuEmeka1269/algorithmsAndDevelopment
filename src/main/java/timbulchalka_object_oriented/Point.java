package timbulchalka_object_oriented;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        Point point = new Point(0,0);
        return Math.sqrt(((this.x - point.x) * (this.x - point.x)+((this.y - point.y)*(this.y - point.y))));
    }

    public double distance(int x, int y){
        Point point = new Point(x, y);
        return Math.sqrt(((this.x - point.x) * (this.x - point.x)+((this.y - point.y)*(this.y - point.y))));
    }

    public double distance(Point point){
        return Math.sqrt(((this.x - point.x) * (this.x - point.x)+((this.y - point.y)*(this.y - point.y))));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
