import java.util.*;

public class Shlok1{
    public static void main(String[] args) {
        
        // GETTING INPUT
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter the Operator that you want to perform: ");
        String op = sc.nextLine();

        // OPERATIONS

        int sum = a + b;
        int sub = b - a;
        int mul = a * b;
        int div = a / b;

        //-------X--------x-------X------------

        String ope = op;

        switch (ope) {
            case "sum":
                System.out.println(sum);
                break;
            case "subtract":
                System.out.println(sub);
                break;
            case "multiply":
                System.out.println(mul);
                break;
            case "divide":
                System.out.println(div);
                break;
        
            default:
                System.out.println("Wrong Operator!!");
                break;
        }



    }
}