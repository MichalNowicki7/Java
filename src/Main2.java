public class Main2 {
    public static void main(String[] args) {
        Point point1 = new Point(100, 100);
        Point point2 = new Point(50, 50);

        Circle radius = new Circle(10);

        Square side = new Square(5);

        Rectangle sides = new Rectangle(7,4);

        Triangle triangle = new Triangle(14, 6);

        TriangleSides triangleSides = new TriangleSides(14, 6, 10, 7);

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

        double circularField = circle.field();
        System.out.println(circularField);

        double circumference = radius.circumference();
        System.out.println(circumference);

        double squareArea = side.squareArea();
        System.out.println(squareArea);

        double squarePerimeter = side.squarePerimeter();
        System.out.println(squarePerimeter);

        double rectArea = sides.rectArea();
        System.out.println(rectArea);

        double rectPerimeter = sides.rectPerimeter();
        System.out.println(rectPerimeter);

        double triArea = triangle.triArea();
        System.out.println(triArea);

        double triPerimeter = triangleSides.triPerimeter();
        System.out.println(triPerimeter);

        System.out.println(poleKola(radius));

        obwodKola(radius);
    }
    static void napiszDupa() {
        System.out.println("Dupa");

    }
    static double policzOdleglosc(Point point1, Point point2) {

        double distanceFrom = point1.distanceFrom(point2);

        return distanceFrom;


    }
    static double poleKola(Circle radius) {

        double circularField = radius.circularField();

        return circularField;
    }
    static double obwodKola(Circle radius) {

        double circumference = radius.circumference();

        return circumference;
    }


}
