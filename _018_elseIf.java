import java.util.Scanner;

public class _018_elseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Fardin";

        // Tradition Switch Case
        switch (str) {
            case "Fardin":
                System.out.println("Hey Fardin!");
                break;
            case "Isra":
                System.out.println("Hey Isra!");
                break;
            case "Salman":
                System.out.println("Hey Salman!");
                break;
            case "Safwan":
                System.out.println("Hey Safwan");
                break;
            case "Faius":
                System.out.println("Hey Faius!");
                break;
            case "Ahmad":
                System.out.println("Hey Ahmad!");
                break;
            default:
                System.out.println("Enjoy Your life!");
        }
        // Enhanced Switch Case
        switch (str) {
            case "Fardin" -> {
                System.out.println("You are going to become an Adult!");
            }
            case "Salman" -> System.out.println("You are going to join a Job!");
            case "Safwan" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }

        int age = input.nextInt();
        if (age > 56) {
            System.out.println("You are experienced!");
        } else if (age > 46) {
            System.out.println("You are semi-experienced!");
        } else if (age > 36) {
            System.out.println("You are semi-semi-experienced!");
        } else {
            System.out.println("You are not experienced!");
        }

        input.close();
    }
}
