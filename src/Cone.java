public class Cone extends RadiusHeight{
    private double slantHeight;

    public Cone(double radius, double height) {
        super(radius, height);
        this.slantHeight = Math.sqrt(radius * radius + height * height);
    }
    public double getSurfaceArea() {
        return Math.PI * getRadius() * (getRadius() + slantHeight);
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * getHeight() / 3;
    }

    public double getSlantHeight() {
        return slantHeight;
    }
}
