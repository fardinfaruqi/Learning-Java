public class _042_Constructors {
    public static void main(String[] args) {
        MyMainEmployee fardin = new MyMainEmployee();
        fardin.setId(35);
        fardin.setName("Fardin Faruqi");
        System.out.println(fardin.getId() + ": " + fardin.getName());

        MyMainEmployee salman = new MyMainEmployee();
        System.out.println(salman.getId() + ": " + salman.getName());

        MyMainEmployee safwan = new MyMainEmployee("Safwan Faruqi");
        safwan.getInfo();
        MyMainEmployee faius = new MyMainEmployee("Faius Faruqi", 5);
        faius.getInfo();
        MyMainEmployee ahmad = new MyMainEmployee(3, "Ahmad Faruqi");
        ahmad.getInfo();
        MyMainEmployee isra = new MyMainEmployee(1);
        isra.getInfo();
    }
}

class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {
        id = 0;
        name = "empty name";
    }

    public MyMainEmployee(String x) {
        id = 0;
        name = x;
    }

    public MyMainEmployee(int x) {
        id = x;
        name = "empty";
    }

    public MyMainEmployee(String x, int y) {
        id = y;
        name = x;
    }

    public MyMainEmployee(int x, String y) {
        id = x;
        name = y;
    }

    public void setId(int x) {
        this.id = x;
    }

    public int getId() {
        return id;
    }

    public void setName(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void getInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ".");
    }
}