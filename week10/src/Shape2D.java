public abstract class Shape2D {
    final double PI = 3.1415;
    double height;
    double radius;
    double width;

    public Shape2D(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Shape2D(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "PI=" + PI +
                ", height=" + height +
                ", radius=" + radius +
                ", width=" + width +
                '}';
    }
}
