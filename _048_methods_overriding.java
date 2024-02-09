class A {
    public int safwan() {
        return 4;
    }

    public void method2() {
        System.out.println("I'm method 2 of class A");
    }
}

class B extends A {
    @Override
    public void method2() {
        System.out.println("I'm method 2 of class B");
    }

    public void method3() {
        System.out.println("I'm method 3 of class B");
    }
}

public class _048_methods_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();
        B b = new B();
        b.method2();
        b.method3();
    }
}
