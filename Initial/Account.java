package Initial;

public class Account {
    private String accountNumber;
    private float balance;
    private Customer customer;

    public Account(String accountNumber, float balance, Customer customer){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public void deposit(float amount){
        this.balance = this.balance + amount;
        System.out.printf("Deposit of $%s \nIn Initial.Account %s \nBalance is $%s%n", amount, this.accountNumber, this.balance);
    }

    public void withdraw(float amount){
        if(amount <= this.balance){
            this.balance = this.balance - amount;
            System.out.printf("Withdraw of $%s \nIn Initial.Account %s \nBalance is $%s%n", amount, this.accountNumber, this.balance);
        }else{
            System.out.printf("Deposit of $%s \nIn Initial.Account %s \nBalance is $%s%n", amount, this.accountNumber, this.balance);
        }
    }

}
