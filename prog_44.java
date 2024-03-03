class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int i) {

        this.radius = i;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int a) {

        this.height = a;
    }

    public int getHeight() {
        return height;
    }

    public float surfaceArea() {
        return (float)(2 * Math.PI * radius * radius + 2 * Math.PI * radius * height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

}

class rect {
    private int length;
    private int breadth;

    public rect() {
        this.length = 4;
        this.breadth = 5;
    }

    public rect(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

}

public class prog_44 {
    public static void main(String[] args) {
        // Practice set 9
        // Problem no 1
        // Cylinder c = new Cylinder();
        // c.setRadius(4);
        // c.setHeight(5);
        // System.out.println(c.getHeight());
        // System.out.println(c.getRadius());

        // Problem no 2
        // Cylinder c = new Cylinder();
        // c.setRadius(9);
        // c.setHeight(12);
        // System.out.println(c.surfaceArea());
        // System.out.println(c.volume());

        // Problem no 3
        // Cylinder c = new Cylinder(9, 12);
        // System.out.println(c.surfaceArea());
        // System.out.println(c.volume());
        // System.out.println(c.getHeight());
        // System.out.println(c.getRadius());

        // Problem no 4
        rect r = new rect(3,4);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());

        // Problem no 5

    }
}
