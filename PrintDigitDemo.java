public class PrintDigitDemo {
    /*
     * 1
     * 2
     * 3
     * 4
     * 5
     */
    static void printDigit(int num) {
        // base case
        if (num == 0) {
            return;
        }
        // small problem
        printDigit(num / 10);
        // post logic (Stack fall)
        System.out.println(num % 10);
    }

    public static void main(String[] args) {
        printDigit(12345);
    }
}
