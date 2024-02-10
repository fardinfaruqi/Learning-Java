public class _054_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleFardin = new AvonCycle();
        cycleFardin.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleFardin.a);
        System.out.println(cycleFardin.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleFardin.a = 454;
        // System.out.println(cycleFardin.a);

        cycleFardin.blowHornK3g();
        cycleFardin.blowHornmhn();
    }
}

interface Bicycle {
    int a = 45;

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface HornBicycle {
    int x = 45;

    void blowHornK3g();

    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle {
    // public int x = 5;
    void blowHorn() {
        System.out.println("Pee Pee Pee Pee...");
    }

    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    public void speedUp(int increment) {
        System.out.println("Applying SpeedUP");
    }

    public void blowHornK3g() {
        System.out.println("PEEP PEEEP PEEP PEEP");
    }

    public void blowHornmhn() {
        System.out.println("Poo Poo Poo Poo");
    }
}
