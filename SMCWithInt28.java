

public class SMCWithInt28 {
    public static int m1(int i){
        System.out.println("m1 called");
        return i*i;
    }
    public static void main(String[] args) {
        m1(31);
        System.out.println(m1(31));

        int total = 100 + m1(31);
        System.out.println(total);
    }
}
