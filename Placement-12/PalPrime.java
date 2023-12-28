import java.util.Scanner;

public class PalPrime {
    public PalPrime(int num,String msg){
        int temp=num,rem,reversed=0;
        boolean isPalindrome=false,isPrime=false,isPalPrime=false;
        while(temp!=0){
            rem=temp%10;
            reversed=(reversed*10)+rem;
            temp/=10;
        }
        if(num==reversed){
            isPalindrome=true;
        }
        temp=num;
        if(num<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime&&isPalindrome){
            isPalPrime=true;
        }
        if(isPalPrime){
            msg="Number "+num+" is PalPrime";
        }
        else if(isPrime&&!isPalindrome){
            msg="Number "+num+" is Prime";
        }
        else if(!isPrime&&isPalindrome){
            msg="Number "+num+" is Palindrome";
        }
        else{
            msg="Number "+num+" is neither Prime nor Palindrome";
        }
        System.out.print("\n"+msg);
    }
    public static void main(String[] args) {
        int size,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        size=sc.nextInt();
        int[] arr=new int[size];
        for(i=0;i<size;i++){
            System.out.print("Enter number "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        for(i=0;i<size;i++){
            new PalPrime(arr[i],"1");
        }
    }
}