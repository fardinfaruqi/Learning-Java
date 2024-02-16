public class _075_thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        // try {
        //     t1.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        t2.start();

    }
}

class MyNewThr1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 50) {
            // System.out.println("I am a thread");
            System.out.println("Thank you: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread {

    public void run() {
        int i = 0;
        while (i < 50) {
            // System.out.println("I am a thread");
            System.out.println("My Thank you: ");
            try {
                Thread.sleep(255);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}