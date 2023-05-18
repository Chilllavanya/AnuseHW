

public class SMCWithObject24 {
    public static void m1(Employee e){
        System.out.println(e.getId() + " " + e.getName() + " " + e.getSal());
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        m1(emp); //None values(values not given)

        Employee emp2 = new Employee(101,"Riya",1000);
        m1(emp2); //through constructor values are given

        Employee emp3 = new Employee(); //directly values given
        emp3.setId(102);
        emp3.setName("Sam");
        emp3.setSal(2000);
        m1(emp3);
    }
}
