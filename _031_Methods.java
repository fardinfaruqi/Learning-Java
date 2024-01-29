public class _031_Methods {

    static int method(int x, int y) {
        int z;
        if (x > 7) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    int method2(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = (a + b) * 5;
        int a1 = 5;
        int b1 = 7;
        int c1 = (a1 + b1) * 5;
        System.out.println(c + " " + c1);

        int x = method(a, b);
        System.out.println(x + " " + method(1, 1));

        // We must create an object of the class to call the non-static methods;
        _031_Methods obj = new _031_Methods();
        int y = obj.method2(1, 9);
        System.out.println(y);

    }
}
