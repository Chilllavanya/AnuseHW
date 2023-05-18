import java.util.Scanner;

public class InputFromUser34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the id : ");
        int id = input.nextInt();
        System.out.println("Enter the name : ");
        String name = input.next();
        System.out.println("Enter the salary : ");
        int salary = input.nextInt();

        InputFromUser34 ifu = new InputFromUser34();
        ifu.show(id,name,salary);
    }
    public void show(int id, String name, int salary){
        System.out.println("Your Id is : " + id + " \nYour name is : " 
                            + name + " \nYour salary is : " + salary);
    }
}
