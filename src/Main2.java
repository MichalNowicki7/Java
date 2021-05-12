public class Main2 {
    public static void main(String[] args) {
        Point point1 = new Point(100, 100);
        Point point2 = new Point(50, 50);

        Circle circle = new Circle(10);

        Square square = new Square(5);

        Rectangle rect = new Rectangle(7,4);

        Triangle triangle = new Triangle(14, 6, 10, 7);

        //System.out.println(Math.sqrt(pow + power));
        Main2.napiszDupa();

        policzOdleglosc(point1, point2);

        Point point3 = new Point(200, 150);
        Point point4 = new Point(130, 90);

        System.out.println(policzOdleglosc(point3, point4));
        //policzOdleglosc(point3, point1);
        //policzOdleglosc(point3, point3);
        double distanceFrom = point4.distanceFrom(point2);
        System.out.println(distanceFrom);

        double circleField = circle.field();
        System.out.println(circleField);

        double circlePerimeter = circle.perimeter();
        System.out.println(circlePerimeter);

        double squareField = square.field();
        System.out.println(squareField);

        double squarePerimeter = square.perimeter();
        System.out.println(squarePerimeter);

        double rectField = rect.field();
        System.out.println(rectField);

        double rectPerimeter = rect.perimeter();
        System.out.println(rectPerimeter);

        double triangleField = triangle.field();
        System.out.println(triangleField);

        double trianglePerimeter = triangle.perimeter();
        System.out.println(trianglePerimeter);

        System.out.println(poleKola(circle));

        obwodKola(circle);

        dodajPola(circle, square, rect, triangle);

        System.out.println(dodajPola(circle, square, rect, triangle));

        double dodajPola = dodajPola(circle, square, rect, triangle);
        System.out.println(dodajPola);

    }
    static void napiszDupa() {
        System.out.println("Dupa");

    }
    static double policzOdleglosc(Point point1, Point point2) {

        double distanceFrom = point1.distanceFrom(point2);

        return distanceFrom;


    }
    static double poleKola(Circle circle) {

        double circleField = circle.field();

        return circleField;
    }
    static double obwodKola(Circle circle) {

        double circlePerimeter = circle.perimeter();

        return circlePerimeter;
    }
    static double dodajPola(Circle circle, Square square, Rectangle rect, Triangle triangle) {
        return Math.abs(circle.field() + square.field() + rect.field() + triangle.field());

    }


}
