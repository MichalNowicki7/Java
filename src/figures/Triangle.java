package figures;

public class Triangle extends AbstractFigure {

    private double a;
    private double h;
    private double b;
    private double c;

    public Triangle(double a, double h, double b, double c) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }

    @Override
    public double field() {
        return Math.abs((this.a * this.h) * 0.5);
    }

    @Override
    public double perimeter() {
        return Math.abs(this.a + this.b + this.c);
    }

    /*public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public figures.Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double triArea () {
        return Math.abs((this.a * this.h) * 0.5);

    }*/

}
