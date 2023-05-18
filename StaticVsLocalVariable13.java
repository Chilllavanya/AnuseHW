//In direct calling of Static variable, local variable get preference and get excuted.


public class StaticVsLocalVariable13{
    private static int x = 10;

    public void show(){
        int x = 100;
        System.out.println(x); //local variable get preference and get excuted

        System.out.println(StaticVsLocalVariable13.x); //calling static variable through class
    }
    public static void main(String[] args) {
        StaticVsLocalVariable13 slv = new StaticVsLocalVariable13();
        slv.show();
    }
}