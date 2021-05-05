public class Triangle {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public double triArea (Triangle triangle) {
        return Math.abs((triangle.a * triangle.h) * 0.5);

    }
    public double triPerimeter (Triangle triangle2) {
        return Math.abs(triangle2.a + triangle2.b + triangle2.c);
    }
}
