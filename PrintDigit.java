class PrintDigit {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int copy = num;
        // Step - 1 Count the Digit
        while (num != 0) {
            num = num / 10;
            count++;
        }
        // System.out.println(count);
        num = copy;
        int power = (int) Math.pow(10, count - 1);
        while (num != 0) {

            System.out.println(num / power);
            num = num % power;
            power = power / 10;
        }

    }
}