package Initial;

public class SavingBankAccount extends BankAccount {
    private double interestRate;

    public SavingBankAccount(){
    }

    public SavingBankAccount(String accountNumber, float balance, Customer customer, double interestRate){
        super(accountNumber, balance, customer);
        this.interestRate = interestRate;
    }

    public void getIncome(){
        System.out.println("Received monthly income");
        this.setBalance((float) (balance + (balance * interestRate)));
        this.getBalance();
    }
}
