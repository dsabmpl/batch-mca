import java.util.Scanner;

public class SOD {

    static int sumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        // int a = 12345;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num");
        int num = sc.nextInt();
        System.out.println(sumOfDigits(num));

    }

}
