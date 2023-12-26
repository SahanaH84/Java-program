import java.util.Scanner;

public class code3 {
    static boolean happy(int n){
        int sum,temp;
        if(n==1||n==7){
            return true;
        }
        sum=n;temp=n;
        while (sum>9){
            sum=0;
            while (temp > 0) {
                int d = temp%10;
                sum += d*d;
                temp/=10;
            }
            if (sum == 1)
                return true;
            temp = sum;
        }
        if(sum == 7)
            return true;
        else    
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("Enter the number:");
        a =sc.nextInt();
        if(happy(a)){
            System.out.println(a+" is a Happy Number.");
        }
        else{
            System.out.println(a+" is not a Happy Number.");
        }
    }
}