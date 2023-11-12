public class Circle {
    private final double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        double area = PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}
