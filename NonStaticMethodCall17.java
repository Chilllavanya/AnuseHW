

public class NonStaticMethodCall17 {
    public void m1(){
        System.out.println("m1 method");
    }
    public static void main(String[] args) {
        NonStaticMethodCall17 smc = new NonStaticMethodCall17();
        smc.m1();
    }
}
