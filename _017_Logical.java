public class _017_Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("For logical AND...");
        if (a && b) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        System.out.println("For logical OR...");
        if (a || b) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        System.out.println("For logical NOT...");
        System.out.println("Not(a) is " + !a);
        System.out.println("Not(b) is " + !b);

    }
}
