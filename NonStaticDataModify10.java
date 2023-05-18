/*
Create Employee object with 101, sam, 1000 data
Display this object data by passing to show method.
add 100 bonus in salary 
Display this object data by passing to show method.abstract
*/

public class NonStaticDataModify10 {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Sam", 1000);
        NonStaticDataModify10 demo = new NonStaticDataModify10();
        demo.show(employee);
        employee.setSal(employee.getSal() + 100);
    }

    public void show(Employee ex){
        System.out.println(ex.getId()+ " " + ex.getName() + " " + ex.getSal());
        ex.setId(102);
    }
}
