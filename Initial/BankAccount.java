package Initial;

public abstract class BankAccount {
    protected String accountNumber;
    protected float balance;
    protected Customer accountOwner;

    public BankAccount(){
    }

    public BankAccount(String accountNumber, float balance, Customer accountOwner){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountOwner = accountOwner;
        System.out.printf("Created account %s for customer %s%n", accountNumber, accountOwner.getName());
        this.getBalance();
    }

    public void deposit(float amount){
        this.balance = this.balance + amount;
        System.out.printf("Deposit of $%s in account %s \n", amount, this.accountNumber);
        this.getBalance();
    }

    public void withdraw(float amount){
        if(amount <= this.balance){
            this.balance = this.balance - amount;
            System.out.printf("Withdraw of $%s in account %s \n", amount, this.accountNumber);
        }else{
            System.out.printf("Withdraw of $%s in account %s is not possible \n", amount, this.accountNumber);
        }
        this.getBalance();
    }

    public Customer getAccountOwner() {
        return accountOwner;
    }

    public float getBalance() {
        System.out.printf("Initial.Account balance is $%s%n", this.balance);
        return this.balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountOwner(Customer accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
