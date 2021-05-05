public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFrom (Point point1) {


        double pow = Math.pow(point1.x - this.x, 2);
        double power = Math.pow(point1.y - this.y, 2);

        return Math.sqrt(pow + power);
    }
}
