package sample;

import javafx.beans.property.SimpleStringProperty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {

    private static Integer transactionsum;
    private static String transactionPurpose;
    private static String transactionDate;

    private static Transaction transaction;

    Transaction(Integer transactionsum, String transactionPurpose, String transactionDate) {
        this.transactionsum = transactionsum;
        this.transactionPurpose = transactionPurpose;
        this.transactionDate = transactionDate;
    }

    public static synchronized Transaction getInstance(){
        if (transaction == null)
            transaction = new Transaction(transactionsum, transactionPurpose, transactionDate);
        return transaction;
    }

    Integer getTransactionsum() {
        return transactionsum;
    }

    public void setTransactionsum(Integer transactionsum) {
        this.transactionsum = transactionsum;
    }

    protected String getTransactionPurpose() {
        return transactionPurpose;
    }

    private void setTransactionPurpose(String transactionPurpose) {
        this.transactionPurpose = transactionPurpose;
    }

    private Date parseData(String transactionDate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        date = format.parse(transactionDate);
        return date;
    }

    private String getTransactionDate() {
        return String.valueOf(transactionDate);
    }

    private void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Transaction() {
    }
}
