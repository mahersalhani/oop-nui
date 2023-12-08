public class Pyramid extends Shape3D {
    public Pyramid(int depth, int height, int width) {
        super(depth, height, width);
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * height * width * depth;
    }

    @Override
    public double getArea() {
        return width * depth + width * Math.sqrt(Math.pow(depth / 2.0, 2) + Math.pow(height, 2)) + depth * Math.sqrt(Math.pow(width / 2.0, 2) + Math.pow(height, 2));
    }
}
