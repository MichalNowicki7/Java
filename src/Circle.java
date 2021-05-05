public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }
    public double circularField (Circle radius) {

        double field = Math.pow(radius.r, 2);
        double pi = Math.PI;

        return Math.abs(field * pi);
    }
    public double circumference (Circle radius) {

        double pi = Math.PI;

        return Math.abs(2 * radius.r * pi);
    }
}

