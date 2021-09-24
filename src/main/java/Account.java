import java.util.ArrayList;
import java.util.Date;

public class Account {

    private Amount value ;
    private ArrayList<Transaction> transactions;

    public Account() {
        this.value= new Amount();
        this.transactions = new ArrayList<>();
    }



    void deposit(double amount, String date ) {
        this.value.plus(amount);
        this.transactions.add(new Transaction(amount,date, value.getValue()));

    }
    void withdraw(double amount, String date){
        this.value.substract(amount);
        this.transactions.add(new Transaction(amount,date,value.getValue()));
    }

    void printStatements() {
        for (Transaction transaction : transactions){
            System.out.println("Transaccion Fecha: " + transaction.getDate() + " Balance: " + transaction.getBalance() + " Monto de transaccion: " + transaction.getValue());
        }

    }
}
