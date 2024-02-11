public class _059_Polymorphism {
    public static void main(String[] args) {

        MyCamera2 cam1 = new MySmartPhone2(); /*
                                               * This is a smartphone being used as a camera, Cannot use it as a
                                               * smartphone
                                               */
        // cam1.getNetwork(); //Not allowed
    }
}

interface MyCamera2 {
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

interface MyWifi2 {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellPhone2 {
    void callNumber(int phoneNUmber) {
        System.out.println("Calling" + phoneNUmber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2 {
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
}