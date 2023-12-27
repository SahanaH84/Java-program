import java.util.Scanner;

public class code1 {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

  
        int[] result = new int[n];

       
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

      
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

    
        System.out.print("Enter the elements of the array: ");
        int[] inputArray = new int[size];
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

    
        int[] outputArray = productExceptSelf(inputArray);

  
        System.out.print("Output array: ");
        for (int num : outputArray) {
            System.out.print(num + " ");
        }

       
    }
}