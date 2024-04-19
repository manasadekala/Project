package org.example;

public class Test {
    public static void main(String[]args) {
        SwiggyService swiggyService = new SwiggyService();
     ListOfResturant listOfResturant  = swiggyService.serchResturant();
     System.out.println(listOfResturant);
    }
}
