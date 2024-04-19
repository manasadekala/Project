package org.example;

import java.util.List;

public class Shop {

    public List<Product>productList;
public void productSelection(Product product){
    if (productList.contains(product)){
        System.out.println("product found " +product);

    }
    else{
        System.out.println("product not found");
    }




    }
}
