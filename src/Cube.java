public class Cube implements ThreeDimensionShapes{
    private double width;

    public Cube(double width) {
        this.width = width;
    }

    public double getVolume() {
        return width * width * width;
    }

    public double getSurfaceArea() {
        return 6 * width * width;
    }

    public double getWidth() {
        return width;
    }
}
