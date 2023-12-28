import java.util.Scanner;
public class code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size,i,j,k,val;
        System.out.print("Enter the size of array:");
        size=sc.nextInt();
        int arr[]=new int[size];
        int temp[]=new int[size];
        j=0;k=0;
        for (i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ":");
            val = sc.nextInt();
            if(val>0){
                temp[j]=val;
                j++;
            }
            else{
                arr[k]=val;
                k++;
            }
        }
        for(i=0;i<j;i++){
            arr[k]=temp[i];
            k++;
        }
        for(i=0;i<k;i++){
            System.out.print(arr[i] + ",");
        }
    }
}