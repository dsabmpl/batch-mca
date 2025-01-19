// Pascal Case class, filename FirstProgram
// Java OOP
// what is class?
/*
 * class - keyword , used to define a class
 * class - BluePrint/ Plan / Template / Prototype
 */
// code = Load + Execute
class Second {
    public static void main(double x) {
        System.out.println("double main");
    }

    public static void main(int x) {
        System.out.println("int main");
    }

    public static void main() {
        System.out.println("no args main");
    }

    /*
     * main - main is a function, entry point of every java program
     * void- keyword (no return )
     * static - keyword - static thing will be loaded once class is loaded.
     * public - keyword - things will be access inside and outside the folder
     * (package)
     * String args[] - Command Line Argument, we can take command inputs
     * String - predefine class
     * [] - Array
     * ... - Var Args
     */
    static public void main(String... a) {
        main();
        main(10);
        main(90.20);
        System.out.println("Hello Java");
        System.out.print("Hi");
        // println() - print in a new line
        // out - is an object , PrintStream class
        // System - predefine class , in , out , err objects created
    }
}