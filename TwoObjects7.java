// Create two objects for Employee class and show method with static and pass those two objects.

public class TwoObjects7 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Sam", 1000);
        Employee e2 = new Employee(102, "Riya", 2000);

        show(e1);
        show(e2);

    }
    public static void show(Employee emp){

        System.out.println("Employee id : " + emp.getId() + 
        "\nEmployee name : " + emp.getName() + "\nEmployee Salary: " + emp.getSal());
   
    }
}
