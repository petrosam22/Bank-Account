public abstract class BankAccount {
    private String accountNumber ;
    private double balance ;
    private String accountHolderName  ;


    public BankAccount(String accountNumber,String accountHolderName){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;

    }
    public void deposit(double amount){
        setBalance(getBalance() + amount);

    }
    public abstract void withdraw(double amount);

    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;

    }

    public String getAccountHolderName(){
        return accountHolderName;
    }


}
