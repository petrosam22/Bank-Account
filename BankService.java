import java.util.ArrayList; // import the ArrayList class

public class BankService {

    ArrayList<BankAccount> bankAccounts  = new ArrayList<BankAccount>();


    public void createAccount(String type,String accountNumber,String holderNumber ){
        if(type.equals("saving")){
            SavingsAccount savingsAccount = new SavingsAccount(accountNumber,holderNumber, 0);
            bankAccounts.add(savingsAccount);
        }else if (type.equals("current")) {
            CurrentAccount currentAccount = new CurrentAccount(accountNumber,holderNumber, 0);
            bankAccounts.add(currentAccount);

        }
        else{
            System.out.println("Invalid account type specified.");
        
        }


    }
    
    public BankAccount findAccountByNumber(String accountNumber){
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAccountNumber().equals(accountNumber)) {
                return bankAccount;
                // System.out.println("Account Number: " + bankAccount.getAccountNumber());
                // System.out.println("Holder Name: " + bankAccount.getAccountHolderName());
                // System.out.println("Balance: $" + bankAccount.getBalance());
                // System.out.println("---------------------");
    
            } 

            
            
        }
        return null;


    }
    public void showAllAccount(){
        for (BankAccount bankAccount : bankAccounts) {
            System.out.println("Account Number: " + bankAccount.getAccountNumber());
            System.out.println("Holder Name: " + bankAccount.getAccountHolderName());
            System.out.println("Balance: $" + bankAccount.getBalance());
            System.out.println("---------------------");
    
        }
    }

    public void depositToAccount(String accountNumber , double amount){
        BankAccount bankAccount = findAccountByNumber(accountNumber);


        if (bankAccount != null) 
        {
            bankAccount.deposit(amount);  
            System.out.println("Deposit successful! New balance: $" + bankAccount.getBalance());
  
        }else{
            System.out.println("Account not found.");

        }
    }

    public void WithdrawMoney(String accountNumber , double amount){
        BankAccount bankAccount = findAccountByNumber(accountNumber);
        if (bankAccount != null) {
            bankAccount.withdraw(amount);
            System.out.println("Withdrawal processed. New balance: $" + bankAccount.getBalance());

            
        }else{
            System.out.println("Account not found.");

        }
    }


    public void checkBalance(String accountNumber){
        BankAccount bankAccount = findAccountByNumber(accountNumber);
        // bankAccounts,
        if (bankAccount != null) 
        {
            bankAccount.getBalance();  
            System.out.println("balance is " + bankAccount.getBalance());
  
        }else{
            System.out.println("Account not found.");

        }
    }
}
