package sample;

public class Cost extends AbstractTransaction {

    private int cost;
    private int finalCost;

    public Cost() {

    }

    @Override
    public void choice(Integer cost, String transactionPurpose, String transactionDate, Integer type){

        switch (type) {
            case 1:
                finalCost += oneTime(cost);
                mTransaction = new Transaction(finalCost, transactionPurpose, transactionDate);
                break;
            case 2:
                finalCost += periodic(cost);
                mTransaction = new Transaction(finalCost, transactionPurpose, transactionDate);
                break;
        }
    }

    public int oneTime(Integer one){
        return one;
    }

    public int periodic(Integer period){
        return period*12;
    }

}
