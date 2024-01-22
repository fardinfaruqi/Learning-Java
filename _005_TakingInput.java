import java.util.Scanner;

public class _005_TakingInput {
    public static void main(String[] args) {
        System.out.println("It works!");
        System.out.println("Taking input from the user: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer 1: ");
        int a = sc.nextInt();
        System.out.print("Enter integer 2: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these integers is " + sum);
        System.out.print("Enter a floating point: ");
        float c = sc.nextFloat();
        System.out.println("Floating point you entered is " + c);
    }
}