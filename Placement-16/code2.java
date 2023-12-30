class PrintNumbers implements Runnable {
    private static final Object lock = new Object();
    private static int count = 1;
    private int remainder;
    private int n;

    public PrintNumbers(int remainder, int n) {
        this.remainder = remainder;
        this.n = n;
    }

    @Override
    public void run() {
        while (count <= n) {
            synchronized (lock) {
                while (count % 2 != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (count <= n) {
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    count++;
                }

                lock.notifyAll();
            }
        }
    }
}

public class code2 {
    public static void main(String[] args) {
        int n = 10;
        PrintNumbers oddPrinter = new PrintNumbers(1, n);
        PrintNumbers evenPrinter = new PrintNumbers(0, n);
        Thread t1 = new Thread(oddPrinter, "Thread 1");
        Thread t2 = new Thread(evenPrinter, "Thread 2");
        t1.start();
        t2.start();
    }
}
