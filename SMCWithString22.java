

public class SMCWithString22 {
    public static void m1(String s){
        System.out.println("s");
    }
    public static void main(String[] args) {
        m1("h"); //irrespective of the string here
                   // only the string mentioned in m1 method get executed. 
    }
}
