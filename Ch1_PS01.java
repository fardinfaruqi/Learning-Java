import java.util.Scanner;

public class Ch1_PS01 {
  public static void main(String[] args) {
    // Sum 3 numbers
    int a = 55;
    int b = 65;
    int c = 75;
    System.out.println(a + b + c);

    int subject1 = 55;
    int subject2 = 79;
    int subject3 = 99;

    float cgpa = (subject1 + subject2 + subject3) / 30.0f;
    System.out.println("CGPA : " + cgpa);

    Scanner sc = new Scanner(System.in);

    System.out.println("What's your name? ");
    System.out.println("Hello " + sc.nextLine() + "!!!");

    System.out.print("Enter a number: ");
    System.out.println("Boolean: " + sc.hasNextInt());
  }
};