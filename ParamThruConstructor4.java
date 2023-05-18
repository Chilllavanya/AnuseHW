/*
 * Create object of Employee class and add 101, sam, 1000 data into 
 * that using constructor/ Display that dta here
 */

public class ParamThruConstructor4 {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Sam", 1000);

        System.out.println("Employee id is : " + employee.getId() + " \nEmployee name is : " 
        + employee.getName() + " \nEmployee salary is : " + employee.getSal() );
    }
}
