package sample;

import java.time.LocalDate;

public abstract class AbstractTransaction {

    Transaction mTransaction = null;

    public abstract void choice(Integer sum, String purpose, String data, Integer type);

    Transaction getTransaction() {
        return mTransaction;
    }
}
