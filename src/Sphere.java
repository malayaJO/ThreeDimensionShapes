public class Sphere implements ThreeDimensionShapes{
    private double radius;
    private double diameter;

    public Sphere (double radius) {
        this.radius = radius;
    }

    public void Diameter(){
        this.diameter = 2 * radius;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return radius * radius * radius * Math.PI * 4 / 3;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }
}
