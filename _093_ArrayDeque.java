import java.util.ArrayDeque;

public class _093_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(33);
        ad1.add(1);
        ad1.addFirst(5);
        System.out.println(ad1.getFirst() + " " + ad1.getLast());
    }
}
