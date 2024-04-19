package org.example.equalshashcode;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class predicate {
    public static void main(String[] args) {
        //  List<ResturantList>resturantListList;
        ResturantDemo resturantDemo = new ResturantDemo();
        resturantDemo.name = "abc";
        ResturantDemo resturantDemo1 = new ResturantDemo();
        resturantDemo1.name = "mns";
        List<ResturantDemo> list = new ArrayList<>();
        list.add(resturantDemo);
        list.add(resturantDemo1);
        ResturantList resturantList = new ResturantList();
        resturantList.resturantDemoList = list;
        for (int i = 0; i < resturantList.resturantDemoList.size(); i++) {
            ResturantDemo resturantDemo2 = resturantList.resturantDemoList.get(i);
            System.out.println("Resturant Name  :" + resturantDemo2.name);
        }
            Iterator<ResturantDemo> resturantListIterator=resturantList.resturantDemoList.iterator();
            for (;resturantListIterator.hasNext();){
                ResturantDemo resturantDemo3=resturantListIterator.next();
                System.out.println("iterator"+resturantDemo.name);

        }
resturantList.resturantDemoList.forEach(resturantDemo2 -> System.out.println(" Cosumer" + resturantDemo.name));

        }
    }

