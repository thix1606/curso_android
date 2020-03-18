package Initial;

public class Exercise01 {
    public static void main(String args[]){

        Customer customer01 = new Customer("Thiago", "Santos");
        Customer customer02 = new Customer("Geraldine", "Barchini");

        Account account01 = new Account("0001", 1000, customer01);
        Account account02 = new Account("0002", 1000, customer02);

        account01.deposit(1);
        account01.withdraw(1);

        account02.deposit(2);
        account02.withdraw(2);

    }
}
