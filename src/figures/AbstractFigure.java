package figures;

public abstract class AbstractFigure implements Figure {
    protected double field;
    protected double perimeter;


    @Override
    public double field() {
        return this.field;
    }

    @Override
    public double perimeter() {
        return this.perimeter;
    }
}