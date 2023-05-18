// Different ways to call static methods

public class VariousStaticMethodCalls11 {
    public static void main(String[] args) {
        
        show(); // calling directly (prefered)
        VariousStaticMethodCalls11.show(); //calling by class name

        VariousStaticMethodCalls11 smc = new VariousStaticMethodCalls11(); //calling static method by object
        smc.show();

        (new VariousStaticMethodCalls11()).show();   // calling by object another way
    }

    public static void show() {
        System.out.println("Show Method");
    }
}