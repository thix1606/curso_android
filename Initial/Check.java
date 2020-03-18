package Initial;

public class Check {
    private String bankName;
    private String dueDate;
    private float amount;

    public Check(){
    }

    public Check(String bankName, String dueDate, float amount){
        this.amount = amount;
        this.bankName = bankName;
        this.dueDate = dueDate;
    }

    public float getAmount() {
        return amount;
    }

    public String getBankName() {
        return bankName;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
