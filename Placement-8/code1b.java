import java.util.Scanner;

public class code1b {
    public static void main(String[] args) {
        float a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a=sc.nextFloat();
        System.out.print("Enter the value of b:");
        b=sc.nextFloat();
        System.out.println("Average of a and b is:"+String.format("%.2f", (a+b)/2));
    }
}
