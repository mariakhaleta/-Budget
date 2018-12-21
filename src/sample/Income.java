package sample;

public class Income extends AbstractTransaction{

    private int income;
    private int finalIncome;

    public Income() {

    }

    @Override
    public void choice(Integer income, String transactionPurpose, String transactionDate, Integer type) {

        switch (type) {
            case 1:
                finalIncome += oneTime(income);
                mTransaction = new Transaction(finalIncome, transactionPurpose, transactionDate);
                break;
            case 2:
                finalIncome += periodic(income);
                mTransaction = new Transaction(finalIncome, transactionPurpose, transactionDate);
                break;
            // System.out.println(transactionPurpose);
        }
    }

    public int oneTime(Integer one){
        return one;
    }

    public int periodic(Integer period){
        return period*12;
    }
}

