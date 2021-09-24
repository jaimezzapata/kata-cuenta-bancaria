
public class Transaction {

    private  double value;
    private String  date;
    private  double balance;

    public Transaction(double value, String date, double balance) {
        this.value = value;
        this.date = date;
        this.balance = balance;
    }

    public double getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }

    public double getBalance() {
        return balance;
    }
}
