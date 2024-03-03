interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth1();
    void meth2();
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
   public void meth3(){
        System.out.println("This is meth3");
    }
   public void meth4(){
        System.out.println("This is meth4");
    }
   public void meth1(){
        System.out.println("This is meth1");
    }
   public void meth2(){
        System.out.println("This is meth2");
    }
}
public class prog_58 {
    public static void main(String[] args){
      MySampleClass ms = new MySampleClass();
      ms.meth1();
      ms.meth2();
      ms.meth3();
      ms.meth4();
    }
}
//  interface ko class me implement kr skte hai extend ni kr skte
