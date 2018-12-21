package sample;

import java.time.LocalDate;
import java.util.Scanner;

public class Cost extends AbstractTransaction {

    private int cost;
    private Integer finalCost;

    public Cost() {

    }

    @Override
    public void choice(Integer cost, String transactionPurpose, String transactionDate, Boolean type){
        if (type = false) {
            finalCost+=oneTime(cost);
            mTransaction = new Transaction(finalCost, transactionPurpose, transactionDate);
        }

        if(type = true){

            finalCost+=periodic(cost);
            mTransaction = new Transaction(finalCost, transactionPurpose, transactionDate);
        }
    }

    public int oneTime(Integer one){
        return one;
    }

    public int periodic(Integer period){
        return period*12;
    }

}
