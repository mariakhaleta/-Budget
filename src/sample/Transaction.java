package sample;

import javafx.beans.property.SimpleStringProperty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {

    private Integer transactionsum;
    private String transactionPurpose;
    private String transactionDate;

    private static Transaction transaction;

    Transaction(Integer transactionsum, String transactionPurpose, String transactionDate) {
        this.transactionsum = transactionsum;
        this.transactionPurpose = transactionPurpose;
        this.transactionDate = transactionDate;
    }

    public static Transaction getInstance(Integer transactionsum, String transactionPurpose, String transactionDate){
        if (transaction == null)
            transaction = new Transaction(transactionsum, transactionPurpose, transactionDate);
        return transaction;
    }

    public Integer getTransactionsum() {
        return transactionsum;
    }

    public void setTransactionsum(Integer transactionsum) {
        this.transactionsum = transactionsum;
    }

    public String getTransactionPurpose() {
        return transactionPurpose;
    }

    public void setTransactionPurpose(String transactionPurpose) {
        this.transactionPurpose = transactionPurpose;
    }

    private Date parseData(String transactionDate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        date = format.parse(transactionDate);
        return date;
    }

    public String getTransactionDate() {
        return String.valueOf(transactionDate);
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
}
