public class _052_PS10 {
    public static void main(String[] args) {

        // Problem 1
        Circle newCircle = new Circle(5);
        System.out.println(newCircle.area());
        Cylinder newCylinder = new Cylinder(5, 6);
        System.out.println(newCylinder.volume());

        // Problem 2
        Rectangle newRectangle = new Rectangle(5, 6);
        System.out.println(newRectangle.area());
        Cuboid newCuboid = new Cuboid(5, 6, 7);
        System.out.println(newCuboid.area() + " " + newCuboid.volume());
        Rectangle newObject = new Cuboid(1, 2, 3);
        // System.out.println(newObject.area() + " " + newObject.volume());
        /*
         * not allowed to access child class's methods
         * in Parent data type objects;
         */
    }
}

class Circle {
    public int radius;

    Circle() {
    };

    Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    public int height;

    Cylinder() {
    };

    Cylinder(int radius, int height) {
        super(radius);
        super.radius = radius;
        /*
         * In Java, the "super" keyword always refers to the immediate parent class, not
         * the first class in the inheritance hierarchy.
         */
        this.radius = radius;
        this.height = height;
    };

    public double volume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }
}

class Rectangle {
    int length = 0, width = 0;

    Rectangle() {
    };

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    };

    public int area() {
        return this.length * this.width;
    }
}

class Cuboid extends Rectangle {
    int height = 0;

    Cuboid() {
    };

    Cuboid(int length, int width, int height) {
        super(length, width);
        this.height = height;
    };

    public int volume() {
        return area() * height;
    }
}