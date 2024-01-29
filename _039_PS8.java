import java.util.*;

class Employee {
    int salary;
    String name;

    static Scanner sc = new Scanner(System.in);

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        // sc.close();
    }

    public void setSalary() {
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        salary = sc.nextInt();
        // sc.close();
    }
}

class Cellphone {

    public void ringing() {
        System.out.println("Ringing......");
    }

    public void vibrating() {
        System.out.println("Vibrating......");
    }

}

class Square {
    int side;

    public int area(int x) {
        side = x;
        return side * side;
    }

    public int perimeter(int x) {
        side = x;
        return side * 4;
    }
}

public class _039_PS8 {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName();
        employee1.setSalary();
        System.out.println("Name: " + employee1.getName() + ". Salary: " + employee1.getSalary());

        Cellphone phone1 = new Cellphone();
        phone1.ringing();
        phone1.vibrating();

        Square sq = new Square();
        System.out.println(sq.area(5));
        System.out.println(sq.perimeter(5));
    }
}
