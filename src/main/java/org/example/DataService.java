package org.example;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    public List<String>getName(){

        List<String>nameList=new ArrayList<>();
        for (int i=0;i<104;i++){
            nameList.add(String.valueOf(i));

        }
    return nameList;
    }
}
