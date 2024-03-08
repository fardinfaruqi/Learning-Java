import java.util.ArrayList;

public class _091_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l2.add(14);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l2.add(18);
        l1.addAll(l2);
        System.out.println(l1.contains(1));
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.indexOf(55));
        System.out.println(l1.lastIndexOf(6));
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + ", ");
        }
        System.out.println();
        l1.add(0, 1);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + ", ");
        }
        l1.clear();
        l2.clear();
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + ", ");
        }
    }
}
