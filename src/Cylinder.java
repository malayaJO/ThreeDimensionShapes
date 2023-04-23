public class Cylinder extends RadiusHeight{

    public Cylinder(double radius, double height) {
        super(radius, height);
    }

    public double getSurfaceArea() {
        double hold = 2 * Math.PI * getRadius() * getRadius();
        double hold2 = 2 * Math.PI * getRadius() * getRadius();
        return hold + hold2;
    }


    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * getHeight();
    }
}
