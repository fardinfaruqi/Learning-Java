public class _057_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetwork();
        for (String item : ar) {
            System.out.println(item);
        }
        ms.record4KVideo();
    }
}

interface MyCamera {
    void takeSnap();

    void recordVideo();

    private void sayHello() {
        System.out.println("Hello..!");
    }

    default void record4KVideo() {
        sayHello();
        System.out.println("Recording in 4K...");
    }
}

interface MyWifi {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNUmber) {
        System.out.println("Calling" + phoneNUmber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {
    public void takeSnap() {
        System.out.println("Taking snap...");
    }

    public void recordVideo() {
        System.out.println("Taping the scenes...");
    }

    public String[] getNetwork() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "Fardin36", "Monir Faruqe", "SecretNexus" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    public void sayHello() {
        // Code...
    } // Doesn't access the implemented interface's sayHello method as that is private.

    // public void record4KVideo() {
    //      System.out.println("Recording in 4K... in class");
    // }
}