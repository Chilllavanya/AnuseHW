// Different ways to call static variables.

public class VariousStaticVariableCall12 {
    private static int total = 10;

    public static void main(String[] args) {
        System.out.println(total); //Direct calling, not prefered as local variable get precedence

        System.out.println(VariousStaticVariableCall12.total); //calling through class(prefered)

        VariousStaticVariableCall12 svc = new VariousStaticVariableCall12();
        System.out.println(svc.total); //calling through object, not prefered due to wastage of memory as non-static variables also get initialized.

    }
}
