public class Main {
    public static void main(String[] args) {

        Cube test = new Cube(4.00);
        RectangularPrism test1 = new RectangularPrism(4.0, 5.0, 6.0);
        TriangularPrism test2 = new TriangularPrism(4.0, 8.0, 15.0, 17.0);

        System.out.println("Cube test SA = " + test.getSurfaceArea());
        System.out.println("Cube test Volume = " + test.getVolume());
        System.out.println();

        System.out.println("Rectangle test1 SA = " + test1.getSurfaceArea());
        System.out.println("Rectangle test1 Volume = " + test1.getVolume());
        System.out.println();

        System.out.println("Triangle prism test2 SA = " + test2.getSurfaceArea());
        System.out.println("Triangle prism test2 Volume = " + test2.getVolume());
        System.out.println("Triangle prism test2 Vertex angle = " + test2.getVertexAngle());
        System.out.println("Triangle prism test2 side angle = " + test2.getSideAngle());
    }
}