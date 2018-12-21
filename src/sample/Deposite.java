package sample;

import java.time.LocalDate;
import java.util.Scanner;

public class Deposite extends AbstractTransaction {

    private int deposite;
    private int finalDeposite;
    private double depos;

    @Override
    public void choice(Integer deposite, String transactionPurpose, String transactionDate, Integer procent) {

        System.out.println(procent);
        depos = deposite + (deposite/procent);
        System.out.println(depos);
        int finalDeposite = (int) depos;
        System.out.println(finalDeposite);
        mTransaction = new Transaction(finalDeposite, transactionPurpose, transactionDate);
    }

}
