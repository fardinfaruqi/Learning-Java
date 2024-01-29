public class _035_PS_Methods {

    static void multiplicationTable(int x) {
        for (int i = 1; i < +10; i++) {
            System.out.println(x + " X " + i + " = " + x * i);
        }
    }

    static void pattern1(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int sumOfN(int x) {
        if (x == 0 || x == 1) {
            return x;
        } else {
            return x + sumOfN(x - 1);
        }
    }

    static void pattern2(int x) {
        for (int i = x; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int fib(int x) {
        if (x == 1 || x == 2) {
            return x - 1;
        } else {
            return fib(x - 1) + fib(x - 2);
        }
    }

    static float avg(float... arr) {
        float sum = 0;
        for (float f : arr) {
            sum += f;
        }
        return sum / arr.length;
    }

    static void patter3(int x) {
        if (x != 0) {
            for (int i = 0; i < x; i++) {
                System.out.print("* ");
            }
            System.out.println();
            patter3(x - 1);
        }
    }

    static void patter4(int x) {
        if (x > 0) {
            patter4(x - 1);
            for (int i = 0; i < x; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Problem 1
        multiplicationTable(5);
        System.out.println();

        // Problem 2
        pattern1(5);
        System.out.println();

        // Problem 3
        System.out.println(sumOfN(10));
        System.out.println();

        // Problem 4
        pattern2(5);
        System.out.println();

        // Problem 5
        System.out.println(fib(7));
        System.out.println();

        // Problem 6
        float arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(avg(arr));
        System.out.println();

        // Problem 7
        patter3(5);
        System.out.println();

        // Problem 8
        patter4(5);

    }
}
