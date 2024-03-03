class MyMainEmployee {
    private int id;
    private String name;

    // constructor
    public MyMainEmployee(String myName, int idi) {
        id = idi;
        name = myName;
    }

    public MyMainEmployee() {
        id = 45;
        name = "prashant thakur";
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;

    }

    public int getId() {
        return id;
    }
}

public class prog_42 {
    public static void main(String[] args) {
        // Constructors in Java
        @SuppressWarnings("unused")
        MyMainEmployee prashant = new MyMainEmployee("Prashant", 566);
        MyMainEmployee sushant = new MyMainEmployee();
        // MyMainEmployee sushi = new MyMainEmployee("Sushant");
        // System.out.println(sushi.getId());
        // System.out.println(sushi.getName());
        sushant.setName("Prashant");
        sushant.setId(445);
        // System.out.println(prashant.getId());
        System.out.println(sushant.getId());
        System.out.println(sushant.getName());
        // System.out.println(prashant.getName());
        // System.out.println(sushant.getId());
        // System.out.println(sushant.getName());
    }
}
