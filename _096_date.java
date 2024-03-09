import java.util.Date;

public class _096_date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() / 1000 / 3650 / 24 / 365);
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}
