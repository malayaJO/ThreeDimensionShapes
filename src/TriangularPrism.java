public class TriangularPrism extends Prism{
    private double hypotenuse;
    private double vertexAngle; //angle at top of triangle
    private double sideAngle; //angle on side of triangle. the angle that is not the right angle or the vertex angle.

    public TriangularPrism(double length, double a, double b, double c) {
        super(length, a, b);
        if (Math.sqrt((a * a) + (b * b)) != c) {
            throw new IllegalArgumentException("Not a right triangle prism.");
        }
        this.hypotenuse = c;
        vertexAngle = Math.atan2(a, b);
        vertexAngle = vertexAngle * 180 / Math.PI;
        sideAngle = 180 - (vertexAngle + 90.0);
    }

    public double getVolume() {
        return getBase() * getHeight() * getLength() / 2;
    }

    public double getSurfaceArea() {
        double trianglesSA = getHeight() * getBase();
        double rectangleSA = getLength() * (getHeight() + getBase() + hypotenuse);
        return trianglesSA + rectangleSA;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double getVertexAngle() {
        return vertexAngle;
    }

    public double getSideAngle() {
        return sideAngle;
    }
}
