public class Fact {
    static void fact(int num, int result) {
        if (num == 1) {
            System.out.println(result);
            return;
        }
        fact(num - 1, result * num);
    }

    public static void main(String[] args) {
        // 5! = 5 * 4 * 3 * 2 * 1 = 120
        fact(5, 1);
    }
}
