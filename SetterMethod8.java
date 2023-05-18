// Find out put

public class SetterMethod8 {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Sam", 1000);
        SetterMethod8.show(emp);
        System.out.println(emp.getId() + emp.getName() + emp.getSal());
    }
    public static void show(Employee ex) {
        System.out.println(ex.getId()+ " " + ex.getName() + " " + ex.getSal());
        ex.setId(102);
    }
}
