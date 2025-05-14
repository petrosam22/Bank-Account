import java.util.Scanner;

public class BankAccountManagementSystem {
   public static void main(String args[]) {
      BankService bankService = new BankService();
      while (true) {
         Scanner Scanner = new Scanner(System.in);

         System.out.println("Create new bank accounts");
         System.out.println("Deposit money");
         System.out.println("Withdraw money");
         System.out.println("Check their balance");
         System.out.println("Exit the system gracefully");
         int UserChoice = Scanner.nextInt();
         Scanner.nextLine();
         if (UserChoice == 1) {
            // Create new bank accounts

            System.out.println("Enter The Account Type!");
            String type = Scanner.nextLine();
            System.out.println("Enter The Account Number!");
            String accountNumber = Scanner.nextLine();
            System.out.println("Enter The Holder Number!");

            String holderNumber = Scanner.nextLine();
            System.out.println("Enter The Balance!");

            double balance = Scanner.nextDouble();
            bankService.createAccount(type, accountNumber, holderNumber);
            bankService.showAllAccount();

         } else if (UserChoice == 2) {
            // Deposit money
            System.out.println("Enter The Balance!");

            double balance = Scanner.nextDouble();
            System.out.println("Enter The Account Number!");
            Scanner.nextLine(); // <== add this here

            String accountNumber = Scanner.nextLine();

            bankService.depositToAccount(accountNumber, balance);
            bankService.showAllAccount();

         } else if (UserChoice == 3) {
            // Withdraw money
            System.out.println("Enter The Account Number!");

            String accountNumber = Scanner.nextLine();
            Scanner.nextLine();
            System.out.println("Enter The Amount!");

            double amount = Scanner.nextDouble();
            bankService.WithdrawMoney(accountNumber, amount);

         }

         else if (UserChoice == 4) {
            // Check their balance
            System.out.println("Enter The Account Number!");

            String accountNumber = Scanner.nextLine();

            bankService.checkBalance(accountNumber);

         }

         else {
            System.exit(0);
         }

      }

     

   }
}
