import java.util.Scanner;

public class _082_Nested_Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = { 7, 8, 0, 3, 1, 6 };
        boolean flag = true;

        while (flag) {
            System.out.print("Enter the value of index: ");
            int ind = sc.nextInt();

            try {

                try {

                    System.out.println(marks[ind]);
                    flag = false;

                } catch (ArrayIndexOutOfBoundsException e) {

                    System.out.println("Sorry this index does not exist!");
                    System.out.println("Exception in level 2\n");

                }

            } catch (Exception e) {

                System.out.println("Exception in level 1\n");

            }
        }

        System.out.println("Thanks for using this program");
        sc.close();
    }
}
