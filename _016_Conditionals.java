public class _016_Conditionals {
    public static void main(String[] args) {
        int age = 6;
        if (age >= 18) {
            System.out.println("Yes boy you can drive!");
        } else {
            System.out.println("No boy you cannot drive yet!");
        }

        age = 18;
        boolean condition = (age == 18);
        if (condition) {
            System.out.println("Yes boy you can drive!");
        } else {
            System.out.println("No boy you cannot drive yet!");
        }
    }
}
