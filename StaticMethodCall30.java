

public class StaticMethodCall30 {
    public static String m1(){
        Employee emp = new Employee(101,"Tina",1000);
        return (emp.getId()+" "+emp.getName()+" "+emp.getSal());

    }
    public static void main(String[] args) {
        String ex = m1();
        System.out.println(ex);
    }
}
