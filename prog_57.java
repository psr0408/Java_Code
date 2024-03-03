interface MyCamera {
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

interface MyWiFi {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellPhone {

    void callNumber(String phoneno) {
        System.out.println("Calling " + phoneno);
    }

    void pickCall() {
        System.out.println("Connecting..");

    }
}

class MySmartPhone extends MyCellPhone implements MyWiFi, MyCamera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }
  public void record4kVideo(){
    System.out.println("Recording 4k video");
  }
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

public class prog_57 {
    public static void main(String[] args) {
        // default method
         MySmartPhone ms = new MySmartPhone();
         String [] ar = ms.getNetwork();
         for(String item: ar){
            System.out.println(item);
         }
         ms.record4kVideo();
         ms.callNumber("9305691522");
    }
}
