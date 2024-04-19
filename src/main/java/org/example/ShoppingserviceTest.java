package org.example;

import java.util.ArrayList;
import java.util.List;

public class
ShoppingserviceTest {
    public static void main (String[]args){
        Product shirtProduct=new Product();
          ProductSpecification productSpecification=new ProductSpecification();
       productSpecification.size="41";
       productSpecification.color="white";
       productSpecification.price="3000";
       shirtProduct.Type="shirt";
       shirtProduct.productSpecification=productSpecification;

       Product tShirtproduct =new Product();
       ProductSpecification tshirtprodutSpecification = new ProductSpecification();
       tshirtprodutSpecification.size="40";
       tshirtprodutSpecification.color="red";
       tshirtprodutSpecification.price="3000";
       tShirtproduct.Type="tshit";
       tShirtproduct.productSpecification=tshirtprodutSpecification;

       Product jeansProduct=new Product();
       ProductSpecification jeansProdutSepcifiction=new ProductSpecification();
       jeansProdutSepcifiction.size="32";
       jeansProdutSepcifiction.color="blue";

       jeansProdutSepcifiction.price="1000";
       jeansProduct.Type="jeans";
       jeansProduct.productSpecification=jeansProdutSepcifiction;

       Shop shop=new Shop();
        List<Product>productList=new ArrayList<>();
        productList.add(jeansProduct);

        productList.add(shirtProduct);
        productList.add(tShirtproduct);

        shop.productList=productList;
        shop.productSelection(jeansProduct);
        shop.productSelection(tShirtproduct);







    }







}
