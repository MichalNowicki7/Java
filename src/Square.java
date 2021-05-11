public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }
    public double squareArea () {
        return Math.pow(this.a, 2);
    }
    public double squarePerimeter () {
        return Math.abs(4 * this.a);
    }
}
