public class _040_AccessModifier {
    public static void main(String[] args) {
        MyEmployee fardin = new MyEmployee();
        // fardin.id = 35;
        // fardin.name = "Fardin Faruqi";
        fardin.setId(35);
        fardin.setName("Fardin Faruqi");
        System.out.println("Name: " + fardin.getName() + ". ID: " + fardin.getId() + ".");
    }
}

class MyEmployee {
    private int id;
    private String name;

    public void setId(int x) {
        id = x;
    }

    public int getId() {
        return id;
    }

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }
}