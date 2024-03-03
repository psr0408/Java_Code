public class prog_80 {
    public static void main(String[] args) {
        //  Try catch block in java
        int a =  10;
        int b = 0;
        try{
            double c = (float)a/b;
            System.out.printf("The result is :%4.2f", (c));


        }
        catch(Exception e){
            System.out.print("We can't do that because ");
            System.out.println(e);
        }
    }
}
