public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double rectArea (Rectangle sides) {
        return Math.abs(sides.a * sides.b);
    }
    public double rectPerimeter (Rectangle sides) {
        return Math.abs(2 * sides.a + 2 * sides.b);
    }

}
