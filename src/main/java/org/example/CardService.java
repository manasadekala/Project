package org.example;

import java.util.Date;
import java.util.UUID;

public class CardService {
    CreditCard creditCard;
    public CardService(CreditCard creditCard){

    }public CreditCard card(User user){
       CreditCard creditCard=new CreditCard();
       creditCard.cardHolderName= user.name;
        creditCard.cardNo=UUID.randomUUID().toString();
       creditCard.expiry="2026";
       creditCard.cvv="420";
       creditCard.limit=300000;
       creditCard.avlbileBalance=50000;


       return creditCard;


           }

    public void paymentporcess( String cardNo , double amount){
        if (creditCard.cardNo.equals(cardNo)){
            creditCard.limit=creditCard.limit-amount;
            System.out.println(creditCard.limit);
        }

    }
}