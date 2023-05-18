/*
Create Employee object with 101, "Sam", 1000 data
Display this object by passing to show method
Add 100 bonus in salary
Display this object data by passing to show method
*/
public class StaticDataModify9 {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Sam", 1000);

        show(e);
        e.setSal(e.getSal()+100);
        show(e);
    }

    public static void show(Employee emp){
        System.out.println(emp.getId() + " | " + emp.getName() + " | " + emp.getSal());
    }
}
