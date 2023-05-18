// Create object of Employee  class and add 101 , sam, 1000 data.
// call show method and pass htis created object to show method.

public class StaticMethodCalling5 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(101);
        employee.setName("Sam");
        employee.setSal(1000);

        show(employee);
    }

    public static void show(Employee e){
        
        System.out.println("Employee id is : " + e.getId() + 
        " \nEmployee name is : " + e.getName() + 
        " \nEmployee salary is : " + e.getSal());
    }
}
