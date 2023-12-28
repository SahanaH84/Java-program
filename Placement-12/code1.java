public class BankAccount {
    private static int accountIdCounter = 10000;

    private int acctId;
    private String name;
    private double bal;

    public BankAccount(String name, double initialBalance) {
        this.acctId = ++accountIdCounter;
        this.name = name;
        this.bal = initialBalance;
    }

    public void deposit(double amt) {
        bal += amt;
        printReceipt();
    }

    public void withdraw(double amt) {
        if (amt <= bal) {
            bal -= amt;
            printReceipt();
        } else {
            System.out.println("Insufficient funds. Withdrawal not processed.");
        }
    }

    private void printReceipt() {
        System.out.println("Account id: " + acctId +
                           "\nName: " + name +
                           "\nAccount Balance: Rs." + bal + "\n");
    }
}

public class code1 {
    public static void main(String[] args) {
   
        BankAccount accA = new BankAccount("Account A", 5000);


        BankAccount accB = new BankAccount("Account B", 2500);


        accA.withdraw(1500);
        accB.deposit(1500);

   
        accB.withdraw(3000);
        accA.deposit(3000);
    }
}