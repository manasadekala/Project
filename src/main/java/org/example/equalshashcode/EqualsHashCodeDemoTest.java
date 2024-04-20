package org.example.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCodeDemoTest {
    public static void main (String[]args){
        Address address1=new Address();
        address1.street="sr";
        address1.state= "ts";
        address1.pincode="508206";
        address1.faltNo="201";
        address1.area ="bhavani";



        Address address2=new Address();
        address2.street="sr";
        address2.state= "ts";
        address2.pincode="508206";
        address2.faltNo="201";
        address2.area ="bhavani";

        System.out.print(address1.equals(address2));
        System.out.print(address2.equals(address1));
        System.out.println( "reflexive Test starts here");
        System.out.println("reflexive Test End here");
        System.out.println(address1.equals(address2));

        System.out.println((address2.equals(address1)));
        Set<Address>addresses=new HashSet<>();





















    }
}
