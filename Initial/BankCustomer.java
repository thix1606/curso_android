package Initial;

public class BankCustomer {
    private String customerNumber;
    private Customer customer;
    private String taxId;
    private String regionalId;

    public BankCustomer(){
    }

    public BankCustomer(String customerNumber, Customer customer, String taxId, String regionalId){
        this.customer = customer;
        this.customerNumber = customerNumber;
        this.taxId = taxId;
        this.regionalId = regionalId;
    }

    public String getRegionalId() {
        return regionalId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setRegionalId(String regionalId) {
        this.regionalId = regionalId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
