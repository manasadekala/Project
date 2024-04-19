package org.example;

import java.util.Date;

public class CreditCardServiceTest {
    public static void main(String[] args) {
        Address address=new Address();
        address.flatNo="1-67";
        address.steetNo="6";
        address.area="KPHB";
        address.pincode="522501";

        User user=new User();
        user.name="Manasa";
        user.phoneNo="1234567890";
        user.aadharNo="9876543210";
        user.dateOfBirth="01/01/2000";
        user.panNo="23546";
        user.address=address;
        CreditCard creditCard = new CreditCard();

        CardService cardService=new CardService(creditCard);
        cardService.paymentporcess("789789",500);

        CardService cardService1=new CardService(creditCard);
        cardService1.paymentporcess("789789",500);

        CardService cardService2=new CardService(creditCard);
        cardService2.paymentporcess("789789",500);

    }
}
