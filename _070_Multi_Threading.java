public class _070_Multi_Threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread 111111111111111111");
            System.out.println("I am happyyyyyyyyyyyyyyyy!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread 22222222222222222");
            System.out.println("I am saddddddddddddddddd!");
            i++;
        }
    }
}
