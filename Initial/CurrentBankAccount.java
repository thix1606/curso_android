package Initial;

public class CurrentBankAccount extends BankAccount {

    public CurrentBankAccount(String accountNumber, float balance, Customer accountOwner){
        super(accountNumber, balance, accountOwner);
    }

    public void depositCheck(Check check){
        System.out.printf("Initial.Check deposit of $%s, from %s in account %s, due date is %s \n", check.getAmount(), check.getBankName(), this.accountNumber, check.getDueDate());
        balance = balance + check.getAmount();
        this.getBalance();
    }
}
