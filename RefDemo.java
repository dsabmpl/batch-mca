public class RefDemo {
    /*
     * What is String?
     * String is a predefine class (java.lang.String)
     * String is a collection of chars
     * String has lot of predefine methods (toUpperCase, split, trim , length)
     * String uses String Pool
     * String Immutable
     */
    public static void main(String[] args) {
        int x = 10; // Local Variable int literal
        String name = "Brain Mentors"; // 1 or 0 String Literal
        // String n2 = "Amit".intern(); // 1
        // String n3 = "Amit".intern(); // 0
        String n2 = "Amit"; // 1
        String n3 = "Amit"; // 0
        n3 = "Ram";
        String n = new String("Amit").intern(); // 2 or 1
        // new String("Amit"); - new String object create
        System.out.println(n2 == n); // true
        System.out.println(n2 == n3); // true

        // StringBuffer sb = new StringBuffer(); // Legacy , synchronized
        StringBuilder sb2 = new StringBuilder("amit"); // 16 + 4 // new one
        System.out.println("Cap " + sb2.capacity()); // 16 + 4 = 20
        System.out.println("LEN " + sb2.length()); // 0
        sb2.append("ghfdkjghfghkjghdfkjghfdjkhgfdgjhkgfjkhkjgfkjh");
        System.out.println("Cap " + sb2.capacity()); // 20
        System.out.println("LEN " + sb2.length()); // 4
        // sb2.append("srivastava");

    }
}
