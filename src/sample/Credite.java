package sample;

import java.time.LocalDate;
import java.util.Scanner;

public class Credite extends AbstractTransaction {

    private double finalCredite;
    public Credite() {
    }


    @Override
    public void choice(Integer credite, String transactionPurpose, String transactionDate, Integer procent) {

        finalCredite += credite/procent;
        System.out.println(finalCredite);
        mTransaction = new Transaction((int)finalCredite, transactionPurpose, transactionDate);
    }
}
