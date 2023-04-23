public abstract class RadiusHeight implements ThreeDimensionShapes{
    //common code for shapes with a radius and height
    private double radius;
    private double height;

    public RadiusHeight(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}
