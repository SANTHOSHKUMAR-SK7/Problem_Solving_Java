package AccessSpecifier;

public class BankAccount {
    private double balance = 1000.0;
    String accountNumber = "123456789"; // Default access
    protected String bankName = "SBI";
    public String accountType = "Savings";

    public void showDetails() {
        System.out.println("Balance: " + balance); // ✅ Accessible inside class
        System.out.println("Account Number: " + accountNumber); // ✅ Default - Same package only
        System.out.println("Bank Name: " + bankName); // ✅ Protected - Accessible in subclass
        System.out.println("Account Type: " + accountType); // ✅ Public - Accessible everywhere
    }
}

