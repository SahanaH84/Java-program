import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        int i,count=0;
        char c=' ';
        System.out.print("Enter the string:");
        str=sc.next();
        for(i=0;i<str.length();i++){
            if(count==0){
                c=str.charAt(i);
                count++;
            }
            else{
                if(c==str.charAt(i)){
                    count++;
                }
                else{
                    if(count>1){
                        System.out.print(c+""+count);
                    }
                    else{
                        System.out.print(c);
                    }
                    c=str.charAt(i);
                    count=1;
                }
            }
        }
        if(count>1){
            System.out.print(c+""+count);
        }
        else{
            System.out.print(c);
        }
    }
}