public class _034_recursion {

    // factorial(n) = n * n-1 * n-2 * .....1;
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120;

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial2(int n) {
        int fact = 1;
        for (int i = 1; i <= 5; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // using recursive method
        System.out.println(factorial(5));
        // using loop
        System.out.println(factorial2(5));
    }
}
