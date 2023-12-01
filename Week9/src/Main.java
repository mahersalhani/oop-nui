public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(2.0);
        System.out.println(circle2);
        Circle circle3 = new Circle(3.0, "blue");
        System.out.println(circle3);

        double area1 = circle1.getArea();
        double area2 = circle2.getArea();
        double area3 = circle3.getArea();

        System.out.println("Area of circle1 is " + area1);
        System.out.println("Area of circle2 is " + area2);
        System.out.println("Area of circle3 is " + area3);

        System.out.println("====================================");

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        Cylinder cylinder2 = new Cylinder(2.0);
        System.out.println(cylinder2);
        Cylinder cylinder3 = new Cylinder(3.0, 4.0);
        System.out.println(cylinder3);
        Cylinder cylinder4 = new Cylinder(5.0, 6.0, "blue");
        System.out.println(cylinder4);

        double volume1 = cylinder1.getVolume();
        double volume2 = cylinder2.getVolume();
        double volume3 = cylinder3.getVolume();
        double volume4 = cylinder4.getVolume();

        System.out.println("Volume of cylinder1 is " + volume1);
        System.out.println("Volume of cylinder2 is " + volume2);
        System.out.println("Volume of cylinder3 is " + volume3);
        System.out.println("Volume of cylinder4 is " + volume4);
    }
}