package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    @FXML
    private Button finalCaculating;

    @FXML
    private Label finalBudget;

    @FXML
    private TableColumn<Transaction, String> dataShow;

    @FXML
    private TextField transactionPurpose;

    @FXML
    private RadioButton onesTransaction;

    @FXML
    private RadioButton incomeButton;

    @FXML
    private ToggleGroup radioGroup;

    @FXML
    private RadioButton costButton;

    @FXML
    private DatePicker transactionDate;

    @FXML
    private ToggleGroup typeTransaction;

    @FXML
    private TableColumn<Transaction, Integer> sumShow;

    @FXML
    private RadioButton depositeButton;

    @FXML
    private RadioButton periodTransaction;

    @FXML
    private RadioButton crediteButton;

    @FXML
    private TableView<Transaction> transactionShow;

    @FXML
    private TableColumn<Transaction, String> nameShow;

    @FXML
    private TextField sumTransansaction;

    private static int finalbudget = 0;
    private AbstractTransaction transaction = null;

    private ObservableList<Transaction> transactionData = FXCollections.observableArrayList();

    @FXML
    void initialize() {

        incomeButton.setToggleGroup(radioGroup);
        costButton.setToggleGroup(radioGroup);
        depositeButton.setToggleGroup(radioGroup);
        crediteButton.setToggleGroup(radioGroup);

        onesTransaction.setToggleGroup(typeTransaction);
        periodTransaction.setToggleGroup(typeTransaction);

        initData();
        System.out.println(transactionData.size());

        // устанавливаем тип и значение которое должно хранится в колонке
        sumShow.setCellValueFactory(new PropertyValueFactory<Transaction, Integer>("transactionsum"));
        nameShow.setCellValueFactory(new PropertyValueFactory<Transaction, String>("transactionPurpose"));
        dataShow.setCellValueFactory(new PropertyValueFactory<Transaction, String>("transactionDate"));
        // заполняем таблицу данными
        transactionShow.setItems(transactionData);

        finalCaculating.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

               String purpose = transactionPurpose.getText();
               String date = String.valueOf(transactionDate.getValue());
                if(incomeButton.isSelected()){

                    if(onesTransaction.isSelected()) {
                        int sum = Integer.parseInt(sumTransansaction.getText());
                        Boolean type = false;
                        transaction = new Income();
                        transaction.choice(sum, purpose, date, type);
                        transactionData.add(transaction.getTransaction());
                        finalbudget += transaction.getTransaction().getTransactionsum();
                    }
                    else if (periodTransaction.isSelected()){
                        int sum = Integer.parseInt(sumTransansaction.getText());
                        Boolean type = true;
                        transaction = new Income();
                        transaction.choice(sum, purpose, date, type);
                        transactionData.add(transaction.getTransaction());
                        finalbudget += transaction.getTransaction().getTransactionsum();
                    }
                }
                finalBudget.setText(String.valueOf(finalbudget));

                if(costButton.isSelected()){

                    if(onesTransaction.isSelected()) {
                        int sum = Integer.parseInt(sumTransansaction.getText());
                        Boolean type = false;
                        transaction = new Cost();
                        transaction.choice(sum, purpose, date, type);
                        transactionData.add(transaction.getTransaction());
                        finalbudget -= transaction.getTransaction().getTransactionsum();
                    }
                    else if (periodTransaction.isSelected()){
                        int sum = Integer.parseInt(sumTransansaction.getText());
                        Boolean type = true;
                        transaction = new Cost();
                        transaction.choice(sum, purpose, date, type);
                        transactionData.add(transaction.getTransaction());
                        finalbudget -= transaction.getTransaction().getTransactionsum();
                    }
                }
                finalBudget.setText(String.valueOf(finalbudget));
            }
        });

    }

    private void initData() {
        transactionData.add(new Transaction(100, "На лечение",  "2018/12/11"));
        transactionData.add(new Transaction(200, "На лечение",  "2018/12/11"));
    }
}
