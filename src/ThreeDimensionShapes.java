public interface ThreeDimensionShapes {
    public double getVolume();
    public double getSurfaceArea();
}

/*Write an inheritance hierarchy of three-dimensional shapes.
Make a top-level shape interface that has methods for getting
information such as the volume and surface area of a three-dimensional
shape. Then make classes and subclasses that implement various
shapes such as cubes, rectangular prisms, spheres, triangular prisms,
cones, and cylinders. Place common behavior in superclasses whenever
possible, and use abstract classes as appropriate. Add methods to the
subclasses to represent the unique behavior of each three-dimensional shape,
such as a method to get a sphere’s radius.*/