public class _049_dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj = new Phone();
        SmartPhone smobj = new SmartPhone();
        obj.On();

        Phone obj1 = new SmartPhone(); // Allowed
        // SmartPhone obj2 = new Phone(); // Not Allowed

        obj1.showTime();
        obj1.On();
        // obj1.music(); // Not allowed
    }
}

class Phone {
    public void showTime() {
        System.out.println("Time is 8AM...");
    }

    public void On() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    public void On() {
        System.out.println("Turning on SmartPhone...");
    }
}