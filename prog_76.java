class GoodMorning extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
       System.out.println("Good Morning");
       i++;
    }
}
}
class Welcome extends Thread{
     public void run(){
        int i = 0;
        while(i<10){
        // Problem no 2
        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        }
       System.out.println("Welcome");
       i++;
    }
}
}
public class prog_76 {
    public static void main(String[] args) {
        // Practice Question on thread chapter 13 
        // Problem no 1 & 2
        GoodMorning g = new GoodMorning();
        Welcome w = new Welcome();
        // g.start();
        // w.start();


        // Problem no 3
        // g.setPriority(6);
        // w.setPriority(9);
        // System.out.println(g.getPriority());
        // System.out.println(w.getPriority());


        //  Problem no 4
        // System.out.println(g.getState());
        // System.out.println(w.getState());


        //   Problem no 5
        int i =0;
        while(i<5){
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getState());
        i++;
    }
}
}