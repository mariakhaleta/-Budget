package sample;

import java.time.LocalDate;
import java.util.Scanner;

public class Credite extends AbstractTransaction {

    private int credite;
    private int procent;
    private int finalCredite;
    public Credite() {
    }


    public void choice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму кредита: ");
        credite = sc.nextInt();
        System.out.println("Сколько процентов годовых: ");
        procent = sc.nextInt();

        String transactionPurpose;
        String transactionDate;
        System.out.println("Введите предназначение транзакции: ");
        transactionPurpose = sc.next();
        System.out.println("Введите дату транзакции: ");
        transactionDate = sc.next();

       // mTransaction = new Transaction(finalIncome, transactionPurpose, transactionDate);
    }

    @Override
    public void choice(Integer sum, String purpose, String data, Boolean type) {

    }
}
