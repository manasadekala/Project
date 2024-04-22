package org.example.StreamsMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class StreamDemo {
    public static void main(String[] args) {
        AccountSerivce accountSerivce = new AccountSerivce();
        Map<Account, Account> accountMap = accountSerivce.getAccountDetails();

        Account account = new Account();
        account.accountNo = "111";

        Account fullAccount = accountMap.get(account);
        System.out.println(fullAccount.accountNo);

        Predicate<AccountDetails> creditTypePredicate = (accountDetails)
                -> accountDetails.type.equals("cr");

        List<AccountDetails> creditAccountDetails = fullAccount.accountDetailsList.stream()
                .filter(accountDetails -> creditTypePredicate.test(accountDetails))
                .collect(Collectors.toList());

        System.out.println("Stream Credit account details" + creditAccountDetails);

        List<AccountDetails> normalForcreditAccountDetails = new ArrayList<>();
        for (int i = 0; i < fullAccount.accountDetailsList.size(); i++) {
            if (fullAccount.accountDetailsList.get(i).type.equals("cr")) {
                normalForcreditAccountDetails.add(fullAccount.accountDetailsList.get(i));
            }
        }

        System.out.println("normal for loop Credit account details" + normalForcreditAccountDetails);
        Map<String, Double> groupByTypeSum = fullAccount.accountDetailsList.stream().collect(groupingBy(AccountDetails::
                getType, summingDouble(AccountDetails::getAmount)));
        System.out.println(groupByTypeSum);
        Map<String, Double> groupBynormalMap = new HashMap<String, Double>();
        double creditSum = 0;
        double debitSum = 0;
        for (int i = 0; i < fullAccount.accountDetailsList.size(); i++) {
            if (fullAccount.accountDetailsList.get(i).type.equals("cr")) {
                AccountDetails details = fullAccount.accountDetailsList.get(i);
                creditSum = creditSum + details.getAmount();
            } else if (fullAccount.accountDetailsList.get(i).type.equals("de")) {
                AccountDetails details = fullAccount.accountDetailsList.get(i);
                debitSum = debitSum + details.getAmount();
            }
        }
        System.out.println("Credit Sum " +creditSum +" Debit Sum " +debitSum);

    }
    }
