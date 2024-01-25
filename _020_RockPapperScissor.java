import java.util.Random;
import java.util.Scanner;

public class _020_RockPapperScissor {
    public static void main(String[] args) {

        Random rn = new Random();
        byte p2 = (byte) rn.nextInt(3);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter '0' for Rock, '1' for Papper & '2' for Scissors: ");
        byte p1 = sc.nextByte();

        if (p1 == p2) {
            System.out.println("Draw!!");
        } else if ((p1 == 0 && p2 == 1) || (p1 == 1 && p2 == 2) || (p1 == 2 && p2 == 0)) {
            System.out.println("You lose!!");
        } else {
            System.out.println("You win!!");
        }

        sc.close();
        rn.getClass();
    }
}