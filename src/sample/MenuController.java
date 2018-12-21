package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {
    private ArrayList<Transaction> transactionArrayList;
    public  static int finalbudget = 0;
    public void start() {
        AbstractTransaction transaction = null;
        transactionArrayList = new ArrayList<>();
        while (true) {
            System.out.println("Введите цифру что бы: 1 - Составить бюджет, 2 - Просчитать хватит ли бюджета на год");
            boolean exit = true;
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();
            if (count == 1) {
                while (exit == true) {
                    System.out.println("Выберите цифру под которой вы хотите совершить транзакцию: ");
                    System.out.println("1 - Доход");
                    System.out.println("2 - Расход");
                    System.out.println("3 - Взять кредит");
                    System.out.println("4 - Создать депозит");
                    System.out.println("5- Вывести на экран все транзакции");
                    System.out.println("6 - Выйти из меню добаления транзакции");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
//                            transaction = new Income();
//                            transaction.choice();
//                            transactionArrayList.add(transaction.getTransaction());
//                            finalbudget += transaction.getTransaction().getTransactionsum();
//                            System.out.println("Финальный бюджет: " + finalbudget);
                            break;
                        //System.out.println(String.valueOf(mTransactions.toArray()));
                        case 2:
                            transaction = new Cost();
                           // transaction.choice();
                            transactionArrayList.add(transaction.getTransaction());
                            finalbudget -= transaction.getTransaction().getTransactionsum();
                            System.out.println("Финальный бюджет: " + finalbudget);
                            break;
                        case 3:
                            transaction = new Credite();
                            //transaction.choice();
                            transactionArrayList.add(transaction.getTransaction());
                        case 4:
                            transaction = new Deposite();
                           // transaction.choice();
                            transactionArrayList.add(transaction.getTransaction());
                            finalbudget += transaction.getTransaction().getTransactionsum();
                            System.out.println("Финальный бюджет: " + finalbudget);
                        case 5:
                            for (Transaction transactionArrayList : transactionArrayList) {
                                System.out.println(transactionArrayList);
                            }
                            break;
                        case 6:
                            exit = false;
                            break;
                        default:
                            System.out.println("Введено неправильное значение.");
                            break;
                    }
                }
            }
            else
            if (count == 2) {
                while (exit == true) {
                    System.out.println("Введите бюджет на год: ");
                    int budget = sc.nextInt();
                    System.out.println("Выберите нужные транзакции: 1- Расходы, 2- Кредит");
                    System.out.println("3- Вывести на экран все транзакции");
                    System.out.println("4 - Выйти из меню добаления транзакции");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            transaction = new Cost();
                           // transaction.choice();
                            transactionArrayList.add(transaction.getTransaction());
                            finalbudget -= transaction.getTransaction().getTransactionsum();
                            System.out.println("Оставшийся бюджет: " + finalbudget);
                            break;
                        case 2:
                            transaction = new Credite();
                           // transaction.choice();
                            transactionArrayList.add(transaction.getTransaction());
                            /////
                        case 3:
                            for (Transaction transactionArrayList : transactionArrayList) {
                                System.out.println(transactionArrayList);
                            }
                            break;
                        case 4:
                            exit = false;
                            break;
                        default:
                            System.out.println("Введено неправильное значение.");
                            break;
                    }
                }
            }
        }
    }
}
