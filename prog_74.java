
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void MyThr(Runnable)
    {
        return 
    }
    public void run(){
        int i = 34;
        
        while(i<=69){
            System.out.println("I am a thread " + this.getName());
            // System.out.println("I am a thread");
            i++;
        }
    }
}
public class prog_74 {
    public static void main(String[] args) {
        // Java thread priorities
        MyThr1 t1 = new MyThr1("prashant");
        MyThr1 t2 = new MyThr1("prashant singh rajput");
        MyThr1 t3 = new MyThr1("prashant 2");
        t1.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();
    }
}
