interface MyCamera2 {
    void takeSnap();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
    System.out.println("Recording 4k video in camera");

    }
    void recordVideo();
}

interface MyWiFi2 {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellPhone2 {

    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting..");

    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWiFi2, MyCamera2 {
    public void takeSnap() {
        System.out.println("Taking snap");
    }
//   public void record4kVideo(){
//     System.out.println("Recording 4k video");
//   }
    public void recordVideo() {
        System.out.println("Recording video..");
    }

    public String[] getNetwork() {
        System.out.println("Getting List of Network");
        String[] networkList = { "prashant", "sushant", "khan" };
        return networkList;
    }
    @Override
    public void connectToNetwork(String network) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connectToNetwork'");
    }

}

public class prog_59 {
    public static void main(String[] args) {
     MyCamera2 cam1 = new MySmartPhone2();
     cam1.takeSnap();
     cam1.record4kVideo();
     MyCamera2 c = new MySmartPhone2();
          c.takeSnap();
      
    }
}
