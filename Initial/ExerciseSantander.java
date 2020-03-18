package Initial;

public class ExerciseSantander {
    public static void main(String args[]){
        Customer customer = new Customer("Thiago", "Santos");

        //Create current account
        CurrentBankAccount currentBankAccount = new CurrentBankAccount("0001", (float)0.0, customer);

        //Make deposit
        currentBankAccount.deposit(100);

        //Create check
        Check check = new Check("C6 Bank", "2020/03/10", 200);

        //Deposit check
        currentBankAccount.depositCheck(check);

        //Make withdraw
        currentBankAccount.withdraw(250);

        //Create savings account
        SavingBankAccount savingBankAccount = new SavingBankAccount("0002", (float) 0.0, customer, 0.02);

        //Make deposit
        savingBankAccount.deposit(100);

        //Get income from interest rate
        savingBankAccount.getIncome();

        //Try to make withdraw
        savingBankAccount.withdraw(250);

        //Make withdraw
        savingBankAccount.withdraw((float)25.5);

    }
}
