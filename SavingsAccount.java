public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber,String accountHolderName, double initialBalance){
        super(accountNumber, accountHolderName);
        setBalance(initialBalance);
    }
    @Override
    public  void withdraw(double amount){
        if (getBalance() - amount >=100) {
            setBalance(getBalance()-amount);
            
        }else{
            System.out.println("Insufficient funds. Minimum balance of $100 required.");

        }

    }

}
