import java.util.Scanner;

public class _006_MarksPercentage {
    public static void main(String args[]) {
        System.out.println("____Marks Percetage Calculator____");
        Scanner sc = new Scanner(System.in);
        float totalScore = 0;
        int percetage = 0;

        System.out.print("Math score: ");
        totalScore += sc.nextFloat();
        System.out.print("out of: ");
        percetage += sc.nextInt();

        System.out.print("English score: ");
        totalScore += sc.nextFloat();
        System.out.print("out of: ");
        percetage += sc.nextInt();

        System.out.print("Science score: ");
        totalScore += sc.nextFloat();
        System.out.print("out of: ");
        percetage += sc.nextInt();

        System.out.print("Bengali score: ");
        totalScore += sc.nextFloat();
        System.out.print("out of: ");
        percetage += sc.nextInt();

        System.out.println("You got " + totalScore + " out of " + percetage);
        System.out.println("Percetage is " + ((totalScore / percetage) * 100) + "%");
    }
}
