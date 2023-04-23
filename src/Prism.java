public abstract class Prism implements ThreeDimensionShapes{
    private double length;
    private double base;
    private double height;

    public Prism(double length, double base, double height) {
        this.length = length;
        this.base = base;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
