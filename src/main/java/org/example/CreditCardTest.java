package org.example;

import java.sql.SQLOutput;
import java.util.UUID;

public class CreditCardTest {
public static void main(String[]args){
    User user=new User();
    Address address=new Address();
    address.area="kodad";
    address.flatNo="301";
    address.pincode="383 345";
    address.steetNo="bhavana nagar";

    user.name="manasa";
    user.aadharNo="666 777 555";
    user.address= address;
    user.panNo="657 5463";
    user.phoneNo="654984728";
    user.dateOfBirth="1/3/2002";
CreditCard creditCard=new CreditCard();
creditCard.limit=300000;
creditCard.avlbileBalance=50000;
creditCard.cardHolderName="manasa";
creditCard.cardNo= UUID.randomUUID().toString();
creditCard.cvv="420";
creditCard.expiry="2026";


   // CardService cardService=new CardService();
  // CreditCard creditCard = cardService.card(user);
   // System.out.println(creditCard.cardNo+ "564427");







}

}
