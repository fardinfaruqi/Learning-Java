import java.util.Scanner;

public class _019_Ch4PS {
    public static void main(String[] args) {

        // Question 1
        int a = 10;
        if (a == 11) {
            System.out.println("I'm 11");
        } else {
            System.out.println("I'm not 11");
        }

        // Question 2
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks in Physics: ");
        m1 = sc.nextByte();

        System.out.print("Enter your marks in Chemistry: ");
        m2 = sc.nextByte();

        System.out.print("Enter your marks in Mathematics: ");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3) / 3.0f;

        System.out.println("Your overall percentage is " + avg);
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulations, You have been promoted.");
        } else {
            System.out.println("Sorry, you are not been promoted! Please try again.");
        }

        // Question 3
        float tax = 0.0f;
        float income = 50.0f;
        if (income <= 2.5f) {
            tax = tax + 0;
        } else if (income > 2.5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5f && income < 10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
            // } else if (tax > 5f && tax < 10f) {
        } else {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is " + tax + "lakh/s");

        sc.close();
    }
}
