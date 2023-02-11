// Create a BankAccount class.
public class BankAccount {

  // === MEMBER VARIABLES / ATTRIBUTES ===
  // The class should have the following attributes: (double) checking balance,
  // (double) savings balance.
  private double checkingBalance;
  private double savingsBalance;
  // Create a class member (static) that has the number of accounts created thus
  // far.
  private static int numberOfAccounts = 0;
  // Create a class member (static) that tracks the total amount of money stored
  // in every account created.
  private static double totalAllAccounts = 0;

  // ======= CONSTRUCTOR =======
  // In the constructor, be sure to increment the account count.
  public BankAccount(double checkingBalance, double savingsBalance) {
    this.checkingBalance = checkingBalance;
    numberOfAccounts++;
    totalAllAccounts += checkingBalance;
    this.savingsBalance = savingsBalance;
    numberOfAccounts++;
    totalAllAccounts += savingsBalance;
  }

  // ===== GETTERS & SETTERS for Member Variables =====
  // Create a getter method for the user's checking account balance.
  public double getCheckingBalance() {
    return checkingBalance;
  }

  // Create a getter method for the user's saving account balance.
  public double getSavingsBalance() {
    return savingsBalance;
  }

  // ========= METHODS =========
  // Create a method that will allow a user to deposit money into either the
  // checking or saving, be sure to add to total amount stored.
  public void deposit(double checkingDeposit, double savingsDeposit) {
    checkingBalance += checkingDeposit;
    totalAllAccounts += checkingDeposit;
    savingsBalance += savingsDeposit;
    totalAllAccounts += savingsDeposit;
  }

  // Create a method to withdraw money from one balance. Do not allow them to
  // withdraw money if there are insufficient funds.
  public void withdrawChecking(double checkingWithdrawal) {
    if (checkingWithdrawal > checkingBalance) {
      System.out.println("Insufficient Funds. Withdrawal amount exceeds your checking balance.");
    }
    checkingBalance -= checkingWithdrawal;
    totalAllAccounts -= checkingWithdrawal;
  }

  public void withdrawSavings(double savingsWithdrawal) {
    if (savingsWithdrawal > savingsBalance) {
      System.out.println("Insufficient Funds. Withdrawal cannot exceed your savings balance.");
    }
    savingsBalance -= savingsWithdrawal;
    totalAllAccounts -= savingsWithdrawal;
  }

  // Create a method to see the total money from the checking and saving.
  // Users should not be able to set any of the attributes from the class.
  public void getBothChkSav() {
    System.out.println("Checking Balance: $" + checkingBalance);
    System.out.println("Savings Balance: $" + savingsBalance);
    System.out.println("Total Balance: $" + (checkingBalance += savingsBalance));

  }

  // ======== STATIC METHODS ========
  public static int getNumberOfAccounts() {
    System.out.println("Total Number of Accounts: " + numberOfAccounts);
    return numberOfAccounts;
  }

  public static double getTotalAllAccounts() {
    System.out.println("Total Balance of All Accounts: $" + totalAllAccounts);
    return totalAllAccounts;
  }

}
