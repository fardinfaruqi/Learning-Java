import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class _098_Calender_Class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Dhaka"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.DATE));
        System.out.println("Time: "
                + c.get(Calendar.HOUR) + ":"
                + c.get(Calendar.MINUTE) + ":"
                + c.get(Calendar.SECOND));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2024) ? "Yes" : "NO");
        for (int i = 0; i < TimeZone.getAvailableIDs().length; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}
