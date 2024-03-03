
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    
    public void run(){
        // int i = 34;
        System.out.println("I am a thread");

        // while(true){
            // System.out.println("I am a thread");
        // }
    }
}
public class prog_73 {
    public static void main(String[] args) {
        // Constructors from thread class in java
     MyThr t = new MyThr("prashant");
     MyThr t1 = new MyThr("prashant singh");
     MyThr t2= new MyThr("prashant singh");
     t.start();
     t1.start();
     t2.start();
     System.out.println("The id of thread t is  " + t.getId());
     System.out.println("The name of thread t is  " + t.getName());
     System.out.println("The id of thread t is  " + t1.getId());
     System.out.println("The name of thread t is  " + t1.getName());
     System.out.println("The id of thread t is  " + t2.getId());
     System.out.println("The name of thread t is  " + t2.getName());
    }
}
