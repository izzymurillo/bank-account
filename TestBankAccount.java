public class TestBankAccount {
  
  public static void main(String[] args) {
    
    // ==== Create some Bank Accounts with initial deposit/s ====
    BankAccount bankaccount1 = new BankAccount(1000, 500);
    BankAccount bankaccount2 = new BankAccount(2000, 1000);
    BankAccount bankaccount3 = new BankAccount(5000, 2500);
    BankAccount bankaccount4 = new BankAccount(10000, 5000);

    // ==== Test Methods ====
    System.out.println(bankaccount1.getCheckingBalance());
    System.out.println(bankaccount1.getSavingsBalance());
    
    System.out.println(bankaccount2.getCheckingBalance());
    System.out.println(bankaccount2.getSavingsBalance());
    
    System.out.println(bankaccount3.getCheckingBalance());
    System.out.println(bankaccount3.getSavingsBalance());
    
    System.out.println(bankaccount4.getCheckingBalance());
    System.out.println(bankaccount4.getSavingsBalance());

    bankaccount1.deposit(500, 500);
    bankaccount2.deposit(0, 1000);
    bankaccount3.deposit(1000, 0);
    bankaccount4.deposit(5000, 2000);
    
    bankaccount1.withdrawChecking(200);
    bankaccount2.withdrawChecking(500);
    bankaccount3.withdrawChecking(300);
    bankaccount4.withdrawChecking(1000);
    
    bankaccount1.withdrawSavings(300);
    bankaccount2.withdrawSavings(400);
    bankaccount3.withdrawSavings(500);
    bankaccount4.withdrawSavings(800);
    
    bankaccount1.getBothChkSav();
    bankaccount2.getBothChkSav();
    bankaccount3.getBothChkSav();
    bankaccount4.getBothChkSav();

    BankAccount.getNumberOfAccounts();
    BankAccount.getTotalAllAccounts();





  }

}
