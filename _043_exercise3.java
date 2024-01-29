import java.util.Random;
import java.util.Scanner;

public class _043_exercise3 {
    public static void main(String[] args) {
        GuessTheNumber fardin = new GuessTheNumber();
        fardin.guess();
    }
}

class GuessTheNumber {
    Scanner sc = new Scanner(System.in);
    private int number;
    private int g, c = 0;

    public GuessTheNumber() {
        Random rn = new Random();
        number = rn.nextInt(10);
        // System.out.println(number);
    }

    public void guess() {
        while (g != number) {
            c++;
            System.out.print("Your guess?(0-9): ");
            g = sc.nextInt();
            if (g > number) {
                System.out.println("A little smaller!");
                continue;
            } else if (g < number) {
                System.out.println("A little larger!");
                continue;
            } else {
                System.out.println("You got it this time!! Guess count: " + c);
                sc.close();
                break;
            }
        }
    }
}
