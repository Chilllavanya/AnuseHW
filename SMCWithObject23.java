

public class SMCWithObject23 {
    public static void m1(Object o){
        System.out.println("m1 method");
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        m1(e);
        Product1 p = new Product1();
        m1(p);
        Object obj = new Object();
        m1(obj);

        //irrespective of the object type the string in m1 method get executed.
    }
}
