package org.example.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class SetDemoTest {
    public static void main(String[]args){
        Set<Car> carSet=new HashSet<>();
        Car car1=new Car();
        car1.name="punch";

        Car car2=new Car();
        car2.name="punch";
        carSet.add(car1);
        carSet.add(car2);
        System.out.println(carSet);
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
        Set<Address>addressesSet=new HashSet<>();
        addressesSet.add(address1);
        addressesSet.add(address2);
        System.out.println(addressesSet);


    }
}
