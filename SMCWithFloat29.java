

public class SMCWithFloat29 {
    public static float m1(int i){
        System.out.println("m1 called");
        return i*i;
    }
    public static void main(String[] args) {

        m1(31);
        int total = 100 + m1(31); //doesn't work since return type is float and total is int
        System.out.println(total);
        
    /*  m1(31);  //works since total is float value and return type also float
        float total = 100 + m1(31);
        System.out.println(total);

        float f = m1(31); // works, since all are float values
        float total = 100 + f;
        System.out.println(total);
    */
    }
}
