public class _044_PS09 {
    public static void main(String[] args) {
        Cylinder mCylinder = new Cylinder(12, 9);

        System.out.println(mCylinder.getRadius());
        System.out.println(mCylinder.getHeight());

        mCylinder.setHeight(12);
        System.out.println(mCylinder.getHeight());
        mCylinder.setRadius(9);
        System.out.println(mCylinder.getRadius());

        System.out.println(mCylinder.surfaceArea());
        System.out.println(mCylinder.volume());
    }
}

class Cylinder {
    private int radius;
    private int height;

    Cylinder(int a, int b) {
        this.radius = a;
        this.height = b;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double surfaceArea() {
        return ((2 * 3.1416 * (radius * height)) + (2 * 3.1416 * (radius * radius)));
    }

    public double volume() {
        return (3.1416 * (radius * radius) * height);
    }
}