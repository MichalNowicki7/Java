public class Triangle {

    private double a;
    private double h;

    public double getA() {
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

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double triArea () {
        return Math.abs((this.a * this.h) * 0.5);

    }

}
