import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, i, j = 0, temp = 0, count = 0, unique = 0;
        System.out.print("Enter the size of array:");
        size = sc.nextInt();
        int arr[] = new int[size];
        for (i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < size; i++) {
            if (count == 0) {
                temp = arr[i];
                count++;
                arr[j++] = temp;
            } else {
                if (temp == arr[i]) {
                    count++;
                } else {
                    unique++;
                    temp = arr[i];
                    arr[j++] = temp;
                    count = 1;
                }
            }
        }
        unique++;
        for (i = j; i < size; i++) {
            arr[i] = 0;
        }
        System.out.println("Number of unique elements:" + unique);
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}