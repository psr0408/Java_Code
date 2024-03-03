class MyThreadRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("I am a thread 1");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("I am a thread 2");
            i++;
        }
    }
}

public class prog_71 {
    public static void main(String[] args) {
        // create a java thread using runnable interface
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread t3 = new Thread(t1);
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread t4 = new Thread(t2);
        t3.start();
        t4.start();

    }
}
