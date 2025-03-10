package AccessSpecifier2;
import AccessSpecifier.BankAccount;

public class CustomerApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        // System.out.println("Balance: " + acc.balance); //  Private - Not accessible
        // System.out.println("Account Number: " + acc.accountNumber); //  Default - Not accessible
        // System.out.println("Bank Name: " + acc.bankName); // Protected - Not accessible (no inheritance)
        System.out.println("Account Type: " + acc.accountType); //  Public - Accessible
    }
}

