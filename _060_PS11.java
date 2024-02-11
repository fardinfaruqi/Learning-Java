public class _060_PS11 {
    public static void main(String[] args) {
        // Problem 1
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Problem 2
        Humen man = new Humen();
        man.eat();
        man.sleep();
        man.speak();

        // Problem 3
        Monkey mn = new Humen();

    }
}

abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Write");
    }

    void refill() {
        System.out.println("Refill");
    }

    void changeNib() {
        System.out.println("Changing the nib");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }

    void jump() {
        System.out.println("Jumping...");
    }

    void bite() {
        System.out.println("Biting...");
    }
}

class Humen extends Monkey {
    void speak() {
        System.out.println("Hello sir!...");
    }
}