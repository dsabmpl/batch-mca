public class IfElseDemo {
    public static void main(String[] args) {
        // Simple if else
        // if(10>2){
        // System.out.println("Greater");
        // }
        // else{
        // System.out.println("Smaller");
        // }
        // Multiple if else
        // int a = 1110;
        // int b = 120;
        // int c = 30;
        // if (a > b && a > c) {
        // System.out.println("A is Greater");
        // } else if (b > a && b > c) {
        // System.out.println("B is Greater");
        // } else {
        // System.out.println("C is Greater");
        // }
        // Nested if else
        int a = 10;
        int b = 120;
        int c = 130;
        if (a > b) {
            if (a > c) {
                System.out.println("A is Greater");
            } else {
                System.out.println("C is Greater");
            }
        } else {
            if (b > c) {
                System.out.println("B is Greater");
            } else {
                System.out.println("C is Greater");
            }
        }
    }
}
