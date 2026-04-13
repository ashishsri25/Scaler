public class BankAccount2 {
    private double balance;
    String ownerName;

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if(balance ==0 || balance < amount) {
//            double v = -1.0;
            return -1.0;
        }
        return balance -=amount;
    }

    public void getBalance() {
        System.out.println("Your current balance is " + balance);
    }

    public void setBalance(double amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        BankAccount2 bk = new BankAccount2();
        bk.setBalance(2000);
        bk.getBalance();
        double withdrawAmount = 1500;
        System.out.println("Withdraw amount is " + withdrawAmount);
        double res= bk.withdraw(withdrawAmount);
        if(res==-1){
            System.out.println("Your Current balance is :" + bk.balance +". Account balance is low to withdraw amount: "+ withdrawAmount + ". Please try with lesser amount" );
        }
        else{
            bk.getBalance();
        }
        bk.deposit(1000);
        bk.getBalance();
    }
}
