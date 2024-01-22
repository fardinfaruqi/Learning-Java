public class _014_StringMethods {
    public static void main(String[] args) {
        String name = "Fardin";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lString = name.toLowerCase();
        System.out.println(lString);

        String uString = name.toUpperCase();
        System.out.println(uString);

        name = "     Fardin     ";
        System.out.println("nonTrimmed: " + name);
        System.out.println("trimmed: " + name.trim());
        name = "Fardin";
        System.out.println("substring: " + name.substring(2));
        System.out.println("substring: " + name.substring(0, 5));

        System.out.println(name.replace('F', 'P').replace('i', 'o'));
        System.out.println(name.replace("n", "n Faruqi"));

        System.out.println(name.startsWith("Far"));
        System.out.println(name.startsWith("far"));

        System.out.println(name.endsWith("in"));
        System.out.println(name.endsWith("ir"));

        System.out.println(name.charAt(5));
        System.out.println(name.charAt(1));

        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf("ar"));

        name = "ArrArrarrArrraff";
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf("rr"));
        System.out.println(name.lastIndexOf("rr", 5));

        name = "Fardin";
        System.out.println(name.equals("Fardin"));
        System.out.println(name.equals("fardin"));
        System.out.println(name.equalsIgnoreCase("fardin"));
    }
}
