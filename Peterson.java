import java.util.Scanner;

public class Peterson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        int copy = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            int fact = 1;
            while (digit >= 1) {
                fact = fact * digit;
                digit--;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (sum == copy) {
            System.out.println("Peterson Number");
        } else {
            System.out.println("Not Peterson Number");
        }
        scanner.close();
    }
}
