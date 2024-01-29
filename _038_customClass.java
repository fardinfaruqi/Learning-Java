class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("Name: " + id + ".");
        System.out.println("Id: " + name + ".");
    }

    public void getSalary() {
        System.out.println("Salary: " + salary + ";");
    }
}

public class _038_customClass {
    public static void main(String[] args) {
        Employee fardin = new Employee();
        fardin.id = 12;
        fardin.salary = 34;
        fardin.name = "Fardin Faruqi";

        System.out.println(fardin.id);
        System.out.println(fardin.name);
        System.out.println();
        fardin.printDetails();
        fardin.getSalary();

        System.out.println();

        Employee ahmad = new Employee();
        ahmad.id = 17;
        ahmad.salary = 12;
        ahmad.name = "Ahmad Abdul-Bari";

        ahmad.printDetails();
        ahmad.getSalary();

        System.out.println();
    }
}