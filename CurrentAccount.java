public class CurrentAccount extends BankAccount {


    public CurrentAccount(String accountNumber,String accountHolderName, double initialBalance){
        super(accountNumber, accountHolderName);
        setBalance(initialBalance);
    }
    @Override
    public void withdraw(double amount){
        if(getBalance() - amount >= -500){
            setBalance(getBalance()-amount);
        }
        else{
            System.out.println("Overdraft limit exceeded.");

        }
    }
}
