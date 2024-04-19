package org.example;

import java.util.Scanner;

public class SwiggyTest {
    public static void main(String[]args){
        SwiggyService swiggyService=new SwiggyService();
        ListOfResturant listOfResturant=swiggyService.serchResturant();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Restarant");
        String name =input.nextLine();
        System.out.print("Restarant Name = "+name);





    }

}
