public class _027_Arrays {
    public static void main(String[] args) {
        int marks[] = { 1, 2, 3, 4, 5 };
        float arr[] = { 1, 2, 3, 4, 5 };
        float arr2[] = { 5.0f, 2.0f, 3.5f, 4.7f, 5.1f };
        String arr3[] = { "Fardin", "Salman", "Isra", "Safwan", "Faius", "Ahmad" };

        System.out.println(arr3[0]);
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(arr.length);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();

        // Displaying the array elements using for_each loop.....
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}
