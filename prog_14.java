public class prog_14 {
    public static void main(String[] args) {
        String name = "Prashant Thakur";
        System.out.println(name.length());
        String name1 = name.toLowerCase();
        System.out.println(name1);
        String name2 = name.toUpperCase();
        System.out.println(name2);
        System.out.println(name.trim());
        System.out.println(name.substring(2, 8));
        System.out.println(name.replace('P', 's'));
        System.out.println(name.startsWith("Pa"));
        System.out.println(name.startsWith("Th"));
        System.out.println(name.startsWith("Pr"));
        System.out.println(name.endsWith("ur"));
        System.out.println(name);
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("asha"));
        System.out.println(name.indexOf("a", 4));
        System.out.println(name.equals("prashant Thakur"));
        System.out.println(name.equals("Prashant Thakur"));
        System.out.println(name.equalsIgnoreCase("prashant thakur"));
        String name3 = "prashantantant";
        System.out.println(name3.lastIndexOf("a"));
        System.out.println(name3.lastIndexOf("ant", 9));
    }
}
