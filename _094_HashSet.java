import java.util.HashSet;

public class _094_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(7, 0.5f);
        myHashSet.add(1);
        myHashSet.add(1);
        myHashSet.add(5);
        myHashSet.add(2);
        System.out.println(myHashSet);
    }
}
