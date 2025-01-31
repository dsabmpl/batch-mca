public class SwapFirstAndLast {
    static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    static int swap(int num) {
        int digits = countDigits(num);
        int lastDigit = num % 10;
        int firstDigit = num / (int) Math.pow(10, digits - 1);
        num /= 10;
        int remaining = num % (int) Math.pow(10, digits - 2);
        int number = lastDigit * (int) Math.pow(10, digits - 2) + remaining;
        number *= 10;
        return number + firstDigit;

    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println(swap(num));

    }

}
