

public class StaticMethodCall31 {
    public static Object m1(){
        Employee emp = new Employee(101,"Tina",1000);
        return (emp.getId()+" "+emp.getName()+" "+emp.getSal());

    }
    public static void main(String[] args) {
        Object ex = m1();
        System.out.println(ex);
    }
}
