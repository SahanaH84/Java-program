import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        int size,i,j,k=0;
        System.out.print("Enter a string:");
        str=sc.next();
        size=(str.length()+2)/3;
        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                if(i==0||i==size-1){
                    System.out.print(str.charAt(k++));
                }
                else if(i+j==size-1){
                    System.out.print(str.charAt(k++));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}