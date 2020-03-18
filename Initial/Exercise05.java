package Initial;

public class Exercise05 {
    public static void main(String args[]){
        Customer customer = new Customer("Thiago", "Santos");
        customer.setPhoneNumber("11 993 900 134");

        Car car = new Car("Lexus", "NX300", "Cinza", 2019, 0);

        CarSale carSale = new CarSale(249000,car,customer);

    }
}
