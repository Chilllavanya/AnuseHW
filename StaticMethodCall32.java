

public class StaticMethodCall32 {
    public static int m1(int i){
        return i*i;
    }
    public static void main(String[] args) {
        m1(20); //calling static method without catcing the return value
        System.out.println(m1(20));

        int value = m1(20);  //catching return value
        System.out.println(value);

        int expression = 1000 + m1(20); //catching return value with expression
        System.out.println(expression);
    }
}
