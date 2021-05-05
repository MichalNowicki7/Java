public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }
    public double squareArea (Square side) {
        return Math.pow(side.a, 2);
    }
    public double squarePerimeter (Square side) {
        return Math.abs(4 * side.a);
    }
}
