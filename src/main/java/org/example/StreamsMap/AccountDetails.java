package org.example.StreamsMap;

import java.util.Date;

public class AccountDetails {
    public double amount;
    public String acNo;
    public Date transaction;
    public Date valueDate;
    public String accountNo;
    public String type;


    @Override
    public String toString() {
        return "AccountDetails{" +
                "amount='" + amount + '\'' +
                ", acNo=" + acNo +
                ", transaction=" + transaction +
                ", valueDate=" + valueDate +
                ", accountNo='" + accountNo + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public double getAmount() {
        return amount;
    }



    public Date getTransaction() {
        return transaction;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getType() {
        return type;
    }
}
