
class MyThr2 extends Thread{

    public void run(){
        int i = 34;
        
        while(i<=69){
            System.out.println("I am a thread " + this.getName());
            System.out.println("I am a thread id is " + this.getId());
            try {
                Thread.sleep(150);
            } 
            catch (InterruptedException e) {
               
                e.printStackTrace();
            }
            // System.out.println("I am a thread");
            i++;
        }
    }
}

class MyThr3 implements Runnable{
    public void run(){
        int i = 34;
        
        while(i<=69){
            System.out.println("I am a thread  in second method");
            // System.out.println("I am a thread");
            i++;
        }
    }
}
public class prog_75 {
    public static void main(String[] args) {
        // Java thread methods
    MyThr2 t1 = new MyThr2();
    MyThr3 t2 = new MyThr3();
    t1.start();
    try{

        t1.join();
    }
    catch(Exception e){
             System.out.println(e);
    }
     Thread t5 = new Thread(t2);
     t5.start();
    }
}
