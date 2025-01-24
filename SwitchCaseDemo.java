import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        // Buffer
        Scanner scanner = new Scanner(System.in);
        // final int TEA = 1;
        // final int COFFEE = 2;
        // Menu Driven
        System.out.println("type tea for Tea");
        System.out.println("type coffee for Coffee");
        System.out.println("type drink for Soft Drink");
        System.out.println("type water for Water");
        System.out.println("Enter the Choice...");
        // int choice = scanner.nextInt();
        String choice = scanner.next();
        // int exp =10 + 20 * 3;
        choice = choice.toLowerCase();
        double price = switch (choice) {
            case "tea" -> 50.0;
            case "coffee" -> 100.0;
            case "drink" -> 70.0;
            case "water" -> {
                int ch = 2;
                yield 20 + ch;
            }
            default -> 0.0;

        };
        System.out.println("Price with GST " + (price + price * 0.18));
        // switch - char , byte , int , String
        /*
         * switch (choice) {
         * case "tea":
         * System.out.println("Rs 50");
         * break;
         * case "coffee":
         * System.out.println("Rs 100");
         * break;
         * case "drink":
         * System.out.println("Rs 70");
         * break;
         * case "water":
         * System.out.println("Rs 20");
         * break;
         * default:
         * System.out.println("Wrong Choice...");
         * 
         * }
         */
        scanner.close();
    }
}
