package org.example;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {

    List <Resturant>resturantList;
    public ListOfResturant serchResturant(){
        Resturant snathoDaba = new  Resturant();
        Address snathoDabaAddress =new Address();
        Dish dish= new Dish();
        dish.dishes="MuttonBiryani";
        dish.cost="500";
        dish.type ="non veg";

        
        snathoDabaAddress.area="kdd" ;
        snathoDabaAddress.flatNo="101";
        snathoDabaAddress.pincode="508 206";
        snathoDaba.address =snathoDabaAddress;


        snathoDaba.rateing="4";
        snathoDaba.resturantFeedBack="good";
        List<Dish>dishList=new ArrayList<>();
        dishList.add(dish);
        snathoDaba.dishList=dishList;

        Dish pizza=new Dish();
        pizza .type ="veg pizza";
        pizza.cost="250";
        pizza.dishes ="veg Pizzg";

        Dish pizza1 =new Dish();
        pizza1.dishes="nonveg pizza";
        pizza1.cost ="300";
        pizza1.type ="non veg ";

        Address pizzaHotAddress=new Address();
        Resturant pizzaHot =new Resturant();
        pizzaHot.rateing ="4";
        pizzaHot.resturantFeedBack="good";
        pizzaHot.address = pizzaHotAddress;

        List<Dish> pizzaHotDish=new ArrayList<>();
        pizzaHotDish.add(pizza);
        pizzaHotDish.add(pizza1);
        pizzaHot.dishList=pizzaHotDish;


        List<Resturant> resturants=new ArrayList<>();
        ListOfResturant listOfResturant=new ListOfResturant();
        resturants.add(snathoDaba);
        resturants.add(pizzaHot);
        listOfResturant.resturants=resturants;
        return listOfResturant;








    }


}
