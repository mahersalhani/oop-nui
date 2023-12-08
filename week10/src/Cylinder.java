public class Cylinder extends Shape3D {
    Cylinder(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
