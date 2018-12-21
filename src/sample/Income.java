package sample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Income extends AbstractTransaction{

    private int income;
    private int finalIncome;

    public Income() {

    }

    @Override
    public void choice(Integer income, String transactionPurpose, String transactionDate, Boolean type){
//
//            System.out.println("Тип дохода: 1 - разовый, 2 - периодичный");
//            switch (count){
//                case 1:
//                    finalIncome+=oneTime(income);
//                break;
//                case 2:
//                    finalIncome+=periodic(income);
//                break;
//                default:
//                    System.out.println("Введено неправильное значение.");
//                    break;
//            }

        if (type = false) {
            finalIncome+=oneTime(income);
            mTransaction = new Transaction(finalIncome, transactionPurpose, transactionDate);
        }

        if(type = true){

            finalIncome+=periodic(income);
            mTransaction = new Transaction(finalIncome, transactionPurpose, transactionDate);
        }
       // System.out.println(transactionPurpose);
    }

    public int oneTime(Integer one){
        return one;
    }

    public int periodic(Integer period){
        return period*12;
    }
}
