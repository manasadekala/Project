package org.example;

public class ShoppingService {
    public Product purchase(ProductSpecification productSpecification){
        Product product=new Product();
        product.cost=3000 *productSpecification.quantity;
        product.Type=productSpecification.color;





        return product;


    }

}
