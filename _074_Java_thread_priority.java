public class _074_Java_thread_priority {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("thread1");
        MyThr1 t2 = new MyThr1("thread2");
        MyThr1 t3 = new MyThr1("thread3");
        MyThr1 t4 = new MyThr1("thread4");
        MyThr1 t5 = new MyThr1("thread5 (most important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}

class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {

        int i = 0;
        while (i < 25) {
            // System.out.println("I am a thread");
            System.out.println("Thank you: " + this.getName());
            i++;
        }

    }
}
