public class _032_MethodsOverloading {

    static void telJoke() {
        System.out.println("I'm expert in one thing; \n     Sleepingg!!!!");
    }

    /*
     * Method overloading is not possible just by changing the return type.
     * Parameters must be changed;
     * 
     * static int telJoke() {
     * return 5;
     * }
     */

    static void telJoke(int x) {
        System.out.println("Number " + x + " you entered!?");
    }

    static void telJoke(int x, float y) {
        System.out.println("Number " + x + " & " + y + " you entered!?");
    }

    static int telJoke(int x, int y, int z) {
        return x + y + z;
    }

    static void change(int x) {
        x = 50;
    }

    static void change(int arr[]) {
        arr[0] = 50;
    }

    public static void main(String[] args) {
        telJoke();
        telJoke(5);
        telJoke(7, 5.5f);

        System.out.println(telJoke(1, 2, 3));

        int x = 5;
        change(x);
        System.out.println(x);

        int arr[] = { 1, 2, 3, 4, 5 };
        change(arr);
        System.out.println(arr[0]);
    }
}
