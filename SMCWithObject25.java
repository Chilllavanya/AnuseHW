

public class SMCWithObject25 {
    public static void m1(Object o){
        System.out.println(((Employee)o).getId() + " " + ((Employee)o).getName() + " " + ((Employee)o).getSal());
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        SMCWithObject25.m1(emp); //None values(values not given)

        Employee emp2 = new Employee(101,"Riya",1000);
        SMCWithObject25.m1(emp2); //None values(values not given)
        // m1(emp2); //through constructor values are given

        Employee emp3 = new Employee(); //directly values given
        emp3.setId(102);
        emp3.setName("Sam");
        emp3.setSal(2000);
        m1(emp3);
    }
}
