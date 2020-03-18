package Initial;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private int mileage;

    public Car(){
    }

    public Car(String brand, String model, String color, int year, int mileage){
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
        this.model = model;
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
