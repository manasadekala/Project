package org.example.StreamsMap;




import java.util.*;

public class AccountSerivce {
    public Map<Account,Account>getAccountDetails() {

        Adderss userAdderss=new Adderss();
        userAdderss.area="kkr";
        userAdderss.faltNo="201";
        userAdderss.pincode="201502";
        userAdderss.State="ts";
        userAdderss.street="sr";

        Adderss bankAdderss=new Adderss();
        bankAdderss.area="kkr";
        bankAdderss.faltNo="201";
        bankAdderss.pincode="201502";
        bankAdderss.State="ts";
        bankAdderss.street="sr";

        User user = new User();
        user.name = "maansa";
        user.adrNo = "58585858";
        user.dob = "7/8/1999";


        Account account = new Account();
        account.accountNo = "111";
        account.balance = 2000;



        AccountDetails accountDetails = new AccountDetails();
        accountDetails.acNo = account.accountNo;
        accountDetails.amount = 3000;
        accountDetails.type="cr";
        accountDetails.transaction = new Date();
        accountDetails.valueDate = new Date();

        AccountDetails accountDetails1=new AccountDetails();
        accountDetails1.amount=500;
        accountDetails1.transaction=new Date();
        accountDetails1.type="cr";
        accountDetails1.valueDate=new Date();
        accountDetails1.acNo=account.accountNo;


        AccountDetails accountDetails2=new AccountDetails();
        accountDetails2.amount=200;
        accountDetails2.transaction=new Date();
        accountDetails2.type="debit";
        accountDetails2.valueDate=new Date();
        accountDetails2.acNo=account.accountNo;


        AccountDetails accountDetails3=new AccountDetails();
        accountDetails3.amount=350;
        accountDetails3.transaction=new Date();
        accountDetails3.type="debit";
        accountDetails3.valueDate=new Date();
        accountDetails3.acNo=account.accountNo;

        List<AccountDetails>accountDetailsList=new ArrayList<>();

        accountDetailsList.add(accountDetails);
        accountDetailsList.add(accountDetails1);
        accountDetailsList.add(accountDetails2);
        accountDetailsList.add(accountDetails3);
        account.accountDetailsList=accountDetailsList;

        Map<Account,Account>accountMap=new HashMap<>();
        accountMap.put(account,account);
        return accountMap;
    }

}