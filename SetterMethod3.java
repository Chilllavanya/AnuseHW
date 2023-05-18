/*
Creae object of Employee class and add 101, sam, 1000 data using constructor.
Display that data here.
*/

public class SetterMethod3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.setName("Sam");
        e.setSal(1000);

        System.out.println("Employee id is : " + e.getId() + " \nname is : " + 
        e.getName() + " \nSalary is : " + e.getSal());
    }
}