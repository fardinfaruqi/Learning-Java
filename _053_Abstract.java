public class _053_Abstract {
    public static void main(String[] args) {
        // Parent2 a = new Parent2(); // Not allowed
        child2 b = new child2(); // allowed
    }
}

abstract class Parent2 {
    public Parent2() {
        System.out.println("I'm constructor of Parent2");
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    abstract public void greet();
}

class child2 extends Parent2 {
    @Override
    public void greet() {
        System.out.println("Good morning!");
    }
}

// class child3 extends Parent2 { // not allowed
//      public void newMethod() {
//          System.out.println("Hello from child3...");
//      }
// }
/*
 * child class inheriting abstract class must override the abstract methods of
 * the abstract class and complete it.
 * or child class must also be a abstract type -_-
 */

abstract class child3 extends Parent2 { // allowed
    public void newMethod() {
        System.out.println("Hello from child3...");
    }
}
