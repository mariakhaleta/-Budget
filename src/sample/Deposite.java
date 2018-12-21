package sample;

import java.time.LocalDate;
import java.util.Scanner;

public class Deposite extends AbstractTransaction {

    private int deposite;
    private int procent;
    private int finalDeposite;

    @Override
    public void choice(Integer deposite, String transactionPurpose, String transactionDate, Boolean type) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите сумму депозита: ");
            deposite = sc.nextInt();
            if (deposite > MenuController.finalbudget) {
                System.out.println("Слишком большой депозит, недостаточно средств");
                break;
            }
            System.out.println("Сколько процентов годовых: ");
            procent = sc.nextInt();

            finalDeposite = deposite + (deposite / procent) * 100;

            //String transactionPurpose;
            //String transactionDate;
            System.out.println("Введите предназначение транзакции: ");
            transactionPurpose = sc.next();
            System.out.println("Введите дату транзакции: ");
            //transactionDate = sc.next();
            mTransaction = new Transaction(finalDeposite, transactionPurpose, transactionDate);
        }
    }

}
