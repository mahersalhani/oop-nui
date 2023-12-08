public class TestMain {
    public static void main(String[] args) {
        System.out.println("Shape3D:");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Shape3D sphere = new Sphere(5, 10);
        Shape3D cylinder = new Cylinder(5, 10);
        Shape3D pyramid = new Pyramid(5, 10, 10);
        Shape3D cone = new Cone(10, 10);

        testShape3D(cone);
        testShape3D(sphere);
        testShape3D(pyramid);
        testShape3D(cylinder);

        System.out.println("Shape2D:");
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        Shape2D square = new Square(10);
        Shape2D circle = new Circle(10);
        Shape2D rectangle = new Rectangle(5, 10);

        testShape2D(circle);
        testShape2D(square);
        testShape2D(rectangle);
    }

    public static void testShape3D(Shape3D shape) {
        System.out.println(shape);
        System.out.println("Area: " + shape.getArea());
        System.out.println("Volume: " + shape.getVolume());
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }

    public static void testShape2D(Shape2D shape) {
        System.out.println(shape);
        System.out.println("Area: " + shape.getArea());
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }
}
