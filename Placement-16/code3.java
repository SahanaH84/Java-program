class PrimeNumberFinder implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread 1: Finding prime numbers in the range 0 to 10");
        for (int i = 2; i <= 10; i++) {
            if (isPrime(i)) {
                System.out.println("Thread 1: Prime Number - " + i);
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeNumberFinder implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread 2: Finding palindrome numbers in the range 10 to 50");
        for (int i = 10; i <= 50; i++) {
            if (isPalindrome(i)) {
                System.out.println("Thread 2: Palindrome Number - " + i);
            }
        }
    }

    private boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}

public class code3 {
    public static void main(String[] args) {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        PalindromeNumberFinder palindromeNumberFinder = new PalindromeNumberFinder();
        Thread t1 = new Thread(primeNumberFinder);
        Thread t2 = new Thread(palindromeNumberFinder);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
