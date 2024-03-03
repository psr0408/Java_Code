class MyEmployee {
    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId() {
        return id;
    }
}

public class prog_40 {
    public static void main(String[] args) {
        // Access Modifier
        MyEmployee prashant = new MyEmployee();
        // prashant.id = 54;           we can't access id and name attribute because it is private we can intialize it with setname function
        // prashant.name = "Prashant Thakur"; 
        prashant.setName("Prashant");
        prashant.setId(56);
        System.out.println(prashant.getId());
        System.out.println(prashant.getName());
    }
}
