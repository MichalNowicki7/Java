public class TriangleSides extends Triangle {
    private double b;
    private double c;

    public TriangleSides(double a, double h, double b, double c) {
        super(a, h);
        this.b = b;
        this.c = c;
    }
    public double triPerimeter() {
        return Math.abs(super.getA() + this.b + this.c);
    }
}
