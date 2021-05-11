public class Rectangle implements Figure {
    private double a;
    private double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double field() {
        return Math.abs(this.a * this.b);
    }

    @Override
    public double perimeter() {
        return Math.abs(2 * this.a + 2 * this.b);
    }




        /*public double rectArea () {
    return Math.abs(this.a * this.b);
    }
    public double rectPerimeter () {
        return Math.abs(2 * this.a + 2 * this.b);
    }*/

}
