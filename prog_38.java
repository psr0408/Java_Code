class Employee {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("My id is : " + id);
        System.out.println("My name is : " + name);

    }

    public int getSalary() {
        return salary;
    }

    public void getSalary1() {
        System.out.println("The salary is : " + salary);
    }
}

public class prog_38 {
    public static void main(String[] args) {
        // Custom Java Class
        Employee prashant = new Employee();
        Employee sushant = new Employee();
        // Setting Attribute

        prashant.id = 45;
        prashant.name = "Prashant";
        prashant.salary = 45000;
        sushant.id = 5;
        sushant.name = "Sushant";
        sushant.salary = 500000;
        // Print Details
        // System.out.println(prashant.id);
        // System.out.println(prashant.name);

        // print Detail from custom class
        // prashant.printDetails();
        // sushant.printDetails();
        // prashant.getSalary1();

        // int salary = prashant.getSalary();
        // System.out.println(prashant.getSalary());

    }
}
