import java.util.Scanner;
public class code2 {
    public static void main(String[] args)
    {
        int arr[] = new int[100];
        int partLoc[] = new int[100];
        int partSeq[] = new int[100];
        int size=0,partSize=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter arr size : ");
        size = scan.nextInt();
        System.out.println("Enter arr elements : ");
        for(int i= 0;i<size;i++)
        arr[i] = scan.nextInt();
        System.out.println("Enter partition size : ");
        partSize = scan.nextInt();
        System.out.println("Enter partition sequence : ");
        for(int i =0;i<(size/partSize);i++)
        partSeq[i] = scan.nextInt();
        if(size%partSize!=0)
        partSeq[(size/partSize)] = scan.nextInt();
        //perform operation
        int i = 0,j = partSize-1,t=0;
        while(i<size&&j<size)
        {
            partLoc[t++]= i;
            partLoc[t++]= j;
            i=j+1;
            j = i+(partSize-1);
        }
        if(size%partSize!=0)
        {
            partLoc[t++] = i;
            partLoc[t++] = size-1;
        }
        for(int k = 0;k<=((t-1)/2);k++)
        {
            int st = partLoc[2*(partSeq[k]-1)];
            int sp = partLoc[2*(partSeq[k])-1];
            while(st<=sp)
            {
                System.out.print(arr[st]+" ");
                st++;
            }
        }
    }
}