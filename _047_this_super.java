class FirstClass {
    int a;

    public int getA() {
        return a;
    }

    FirstClass() {
        System.out.println("I'm FirstClass's default Constructor!");
    }

    FirstClass(int a) {
        this.a = a;
        System.out.println("I'm FirstClass's custom Constructor!");
    }

    public int returnone() {
        return 1;
    }
};

class SecondClass extends FirstClass {
    SecondClass(int c) {
        super(5);
        System.out.println("I'm SecondClass's Constructor!");
    }
};

public class _047_this_super {
    public static void main(String[] args) {
        FirstClass e = new FirstClass(65);
        System.out.println(e.getA());
        SecondClass f = new SecondClass(4);
        System.out.println(f);
    }
};
