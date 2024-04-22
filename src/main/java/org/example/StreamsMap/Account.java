package org.example.StreamsMap;

import java.util.List;
import java.util.Objects;

public class Account {
    public String accountNo;
    public double balance;
    public String ifscNo;
    public Adderss adderss;
    public User user;
    List<AccountDetails> accountDetailsList;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Account account = (Account) object;
        return (this.accountNo.equals(account.accountNo));
    }

    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }
}
