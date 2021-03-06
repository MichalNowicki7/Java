package figures;

public class Square implements Figure {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double field() {
        return Math.pow(this.a, 2);
    }

    @Override
    public double perimeter() {
        return 4 * this.a;
    }


    /*public double squareArea () {
        return Math.pow(this.a, 2);
    }
    public double squarePerimeter () {
        return Math.abs(4 * this.a);
    }*/
}
