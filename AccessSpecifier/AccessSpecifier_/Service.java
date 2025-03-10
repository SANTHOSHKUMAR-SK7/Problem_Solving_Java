package AccessSpecifier.AccessSpecifier_;
import AccessSpecifier.*;

public class Service extends BankAccount {
    public void accessDetails() {
        // System.out.println("Balance: " + balance); //  Private - Not accessible
        // System.out.println("Account Number: " + accountNumber); //  Default - Not accessible (different package)
        System.out.println("Bank Name: " + bankName); //  Protected - Accessible (because of inheritance)
        System.out.println("Account Type: " + accountType); //  Public - Always accessible
    }
}

