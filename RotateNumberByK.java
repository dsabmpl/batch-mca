public class RotateNumberByK {
    static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    static int rotate(int num, int k) {
        int digits = countDigits(num);
        k = k % digits;
        int rightPart = num % (int) Math.pow(10, k);
        num /= (int) Math.pow(10, k);
        int number = rightPart * (int) Math.pow(10, digits - k);
        return number + num;
    }

    public static void main(String[] args) {
        int num = 12345;
        int k = 6;
        System.out.println(rotate(num, k));
    }
}
