public class _073_Constructor_from_thead {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Fardin");
        MyThr t2 = new MyThr("Ahmad");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.threadId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.threadId());
        System.out.println("The name of the thread t is " + t2.getName());

    }
}

class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thank you");
        // while(true){
        // System.out.println("I am a thread");
        // }
    }
}
