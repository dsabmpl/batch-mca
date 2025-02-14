public class FirstExample {
    static void show(int num) {
        // base case or termination case (stop the recursion)
        if (num == 0) {
            return; // exit from the method
        }
        System.out.println("Amit " + num);
        show(num - 1);
        System.out.println("Srivastava " + num);
    }

    public static void main(String[] args) {
        show(5);
    }
}
