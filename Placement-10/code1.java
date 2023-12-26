import java.util.ArrayList;
import java.util.Scanner;
public class code1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> even=new ArrayList<Integer>();
        ArrayList<Integer> odd=new ArrayList<Integer>();
        int size,i;
        System.out.print("Enter the size of the array:");
        size=sc.nextInt();
        int[] arr=new int[size];
        for(i=0;i<size;i++){
            System.out.print("Enter element "+(i+1)+":");
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }    
        }
        System.out.print("Entered Array:");
        for(int value : arr){
            System.out.print(value);
        }
        System.out.print("\nEven array:");
        for(Integer value : even){
            System.out.print(value);
        }
        System.out.print("\nOdd array:");
        for(Integer value : odd){
            System.out.print(value);
        }
    }
}