public class PrintPowerOfANumber {

    static int power(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        int small = power(num, pow - 1);
        int big = small * num;
        return big;
    }

    static void power(int num, int pow, int result) {
        if (pow == 0) {
            System.out.println(result);
            return;
        }
        power(num, pow - 1, result * num);
    }

    public static void main(String[] args) {
        // power(2, 5, 1);
        System.out.println(power(2, 5));
        // 2 ^ 5 = 32
        // 2 * 2 * 2 * 2 *2
    }
}
