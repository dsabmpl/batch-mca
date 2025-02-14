public class RecDemo {

    void show() {
        System.out.println("I am the Instance Method...");
    }

    static void disp() {
        System.out.println("I am the Class Method...");
    }

    public static void main(String[] args) {
        // RecDemo obj = new RecDemo();
        // obj.show();
        // RecDemo.disp();
        disp();
    }
}
