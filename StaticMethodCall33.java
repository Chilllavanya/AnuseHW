

public class StaticMethodCall33 {
    public static void show(Employee emp){
        System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());
    }
    public static void process(Employee e){
        e.setId(101);
        e.setName("Ria");
        e.setSal(20000);
    }
    public static void main(String[] args) {
        Employee ex = new Employee();
        process(ex);
        show(ex);
    }
}
