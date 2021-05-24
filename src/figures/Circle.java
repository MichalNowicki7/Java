package figures;

public class Circle implements Figure {
    private double r;
    private double pi = Math.PI;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double field() {
        return Math.pow(this.r, 2) * pi;
    }

    @Override
    public double perimeter() {
        return 2 * this.r * pi;
    }
}
    /*public figures.Circle(double r) {
        this.r = r;
    }

    @Override
    public double field() {
        return Math.abs(Math.pow(this.r, 2) * pi);
    }

    @Override
    public double perimeter() {
        return Math.abs(2 * this.r * pi);
    }*/

    /*public double circularField () {

        double field = Math.pow(this.r, 2);
        double pi = Math.PI;

        return Math.abs(field * pi);
    }
    public double circumference () {

        double pi = Math.PI;

        return Math.abs(2 * this.r * pi);
    }*/


