import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        int count = 0;
        int copy = num;
        int sum = 0;
        // Step - 1 Count the Digit
        while (num != 0) {
            num = num / 10; // make the number small
            count++;
        }
        num = copy;
        while (num != 0) {
            int lastDigit = num % 10;
            int val = (int) Math.pow(lastDigit, count);
            sum = sum + val;
            num = num / 10;

        }
        if (sum == copy) {
            System.out.println("ArmStrong Number");
        } else {
            System.out.println("Not ArmStrong Number");
        }
        scanner.close();

    }
}
