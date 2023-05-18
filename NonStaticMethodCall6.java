// Create object of Employee class and add 101, sam, 1000 data.
// call show method without static and pass this created object to show method.

public class NonStaticMethodCall6 {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Sam", 1000);

        NonStaticMethodCall6 demo = new NonStaticMethodCall6();
        demo.show(emp);
    }
    public void show(Employee e) {
        System.out.println("Employee id : " + e.getId() + 
        "\nEmployee name : " + e.getName() + "\nEmployee Salary: " + e.getSal());
    }
}
