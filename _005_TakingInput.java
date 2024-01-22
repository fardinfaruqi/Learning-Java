import java.util.Scanner;

public class _005_TakingInput {
    public static void main(String[] args) {
        System.out.println("It works!");
        System.out.println("Taking input from the user---------");
        Scanner sc = new Scanner(System.in); // Scanner object

        System.out.print("Enter integer 1: ");
        int a = sc.nextInt(); // nextInt() for taking integer input
        System.out.print("Enter integer 2: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of these integers is " + sum);

        System.out.print("Enter a floating point: ");
        float c = sc.nextFloat(); // taking float input
        System.out.println("Floating point you entered is " + c);

        boolean b1 = sc.hasNextInt(); // taking boolean input for valid integer input
        System.out.println(b1);

        String str = sc.next(); // taking single word string input
        System.out.println(str);
        String str2 = sc.nextLine(); // taking one line string input
        System.out.println(str2);
    }
}