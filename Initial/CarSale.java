package Initial;

public class CarSale {
    private float salePrice;
    private Car soldCar;
    private Customer customer;

    public CarSale(){
    }

    public CarSale(float salePrice, Car soldCar, Customer customer){
        this.salePrice = salePrice;
        this.soldCar = soldCar;
        this.customer = customer;

        System.out.println("REGISTERED SELL:");
        System.out.println("CAR:"+ soldCar.getBrand());
        System.out.println("CUSTOMER:" + customer.getName());
        System.out.println("PRICE:" + salePrice);
    }

    public Car getSoldCar() {
        return soldCar;
    }

    public Customer getCustomer() {
        return customer;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public void setSoldCar(Car soldCar) {
        this.soldCar = soldCar;
    }
}
