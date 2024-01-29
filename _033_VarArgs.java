public class _033_VarArgs {

    static int sum(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    static int sum2(int x, int... arr) {
        int sum = x;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sum());
        // System.out.println(sum(null)); // Array length error;

        System.out.println(sum2(1, 1, 2, 3));
        // System.out.println(sum2()); // gives error ar one argument is compulsory;

    }
}
