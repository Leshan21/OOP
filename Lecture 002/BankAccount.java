public class BankAccount {
    
    private int accNo;
    private double balance;
    
    
    public static double interest = 0.05; 

    public void setData(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void displayData() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: $" + balance);
    }

    public double computeInterest(int years) {
        return balance * interest * years;
    }

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        account.setData(12345, 1000.00);
        account.displayData();
        double interestAmount = account.computeInterest(1); 
        System.out.println("Interest for 1 year: $" + interestAmount);
    }
}
