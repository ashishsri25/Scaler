public class BankAccount {
    double balance;
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

    public static void main(String[] args) {
        BankAccount bk = new BankAccount();
        System.out.println("Updated balance after deposit is " + bk.deposit(1000));
        double withAmount = 2500.00;
        double res= bk.withdraw(withAmount);
        if(res==-1){
            System.out.println("Your Current balance is :" + bk.balance +". Account balance is low to withdraw amount: "+ withAmount + ". Please try with lesser amount" );
        }
        else{
            System.out.println("Updated balance after withdraw is "+ bk.balance);
        }
    }
}
