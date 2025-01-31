public class EvenOddSum {
    static void evenOddSum(int num) {
        int pos = 1, evenSum = 0, oddSum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (pos % 2 == 0) {
                evenSum += lastDigit;
            } else {
                oddSum += lastDigit;
            }

            num /= 10;
            pos++;
        }

        System.out.println("Even Sum is " + evenSum);
        System.out.println("Odd Sum is" + oddSum);
    }

    public static void main(String[] args) {
        int num = 12345;
        evenOddSum(num);

    }

}
