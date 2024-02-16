import java.util.Scanner;

public class _081_Try_Catch_Exceptions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        System.out.print("Enter the array index: ");
        int x = sc.nextInt();

        System.out.print("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();

        try {

            System.out.println("The value at array xex entered is: " + marks[x]);
            System.out.println("The value of array-value/number is: " + marks[x] / number);

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException occurred!");
            System.out.println(e);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);

        } catch (Exception e) {

            System.out.println("Some other exception occurred!");
            System.out.println(e);

        }

        sc.close();
    }
}