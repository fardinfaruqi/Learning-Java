public class _029_PS6 {
    public static void main(String[] args) {

        // Problem 1
        float[] marks = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };
        float sum = 0;
        for (float f : marks) {
            sum += f;
        }
        System.out.println(sum);

        // Problem 2
        float num = 45.7f;
        boolean inInArray = false;
        for (float f : marks) {
            if (num == f) {
                inInArray = true;
                break;
            }
        }
        String result = inInArray ? "Is in Array" : "Is not in Array";
        System.out.println(result);

        if (inInArray)
            System.out.println("Is in array");
        else
            System.out.println("Is not in array");

        // Problem 3
        System.out.println("Avg = " + sum / marks.length);

        // Problem 4
        int arr[] = { 1, 2, 3, 4, 5 };
        int a = Math.floorDiv(arr.length, 2);
        for (int i = 0; i < a; i++) {
            // Swap arr[i] and arr[length-1-i];
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
