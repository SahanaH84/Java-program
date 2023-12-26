import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a,b,res;
        String op;
        System.out.print("Enter number 1:");
        a=sc.nextFloat();
        System.out.print("Enter number 2:");
        b=sc.nextFloat();
        System.out.print("Enter the Operation-(+,-,/,*):");
        op=sc.next();
        if(op.length()>1){
            System.out.println("Invalid Operand");
        }
        else{
            switch (op) {
                case "+":
                    System.out.println("Result:"+(a+b));
                    break;
                case "-":
                    System.out.println("Result:"+(a-b));
                    break;
                case "*":
                    System.out.println("Result:"+(a*b));
                    break;
                case "/":
                    if(b!=0){
                        System.out.println("Result:"+(a/b));
                    }
                    else{
                        System.out.println("Error division by zero");
                    }
                    break;
            
                default:
                    System.out.println("Invalid operand");
                    break;
            }
        }
    }
}