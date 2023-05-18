//Calling static method with class parameter.

public class SMCWithClass21 {
    public static void m1(Employee e){
        System.out.println("m1 method");
    }
    public static void main(String[] args) {
        Employee ex = new Employee(); //create class object
        m1(ex); // pass class object as parameter
    }
}
