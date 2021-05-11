public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }
    public double circularField () {

        double field = Math.pow(this.r, 2);
        double pi = Math.PI;

        return Math.abs(field * pi);
    }
    public double circumference () {

        double pi = Math.PI;

        return Math.abs(2 * this.r * pi);
    }
}

