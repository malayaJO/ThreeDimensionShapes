public class RectangularPrism extends Prism{

    public RectangularPrism(double base, double height, double length) {
        super(base, height, length);
    }

    public double getVolume() {
        return getBase() * getHeight() * getLength();
    }

    public double getSurfaceArea() {
        return 2 * (getBase() * getHeight() + getHeight() * getLength() + getLength() * getBase());
    }
}
