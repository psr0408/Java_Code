class MyThread1 extends Thread{
    @Override 
    public void run(){
        int i =0;
        while(i<40){
        System.out.println("My Thread 1 is running       running "+ i);
        i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override 
    public void run(){
         int i =0;
        while(i<40){
        System.out.println("My Thread 2 is running "+ i);
        i++;
        }
    }
}
public class prog_70 {
    public static void main(String[] args) {
        //  Create a thread by extending thread class
           MyThread1  t1 = new MyThread1();
           MyThread2 t2 = new MyThread2();
         t1.start();
    t2.start();
}
}