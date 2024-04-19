package org.example;

import java.util.List;

public class Resturant {

    public String rateing ;
    public Address address;

    public String resturantFeedBack;
    public String Name;
    List<Dish>dishList;

    public void getRateing() {

    }



    public  boolean  equals(Object object) {
        if (this == object)
            return true;
        if (this.getClass() != object.getClass())
            return false;

        return false;
    }

    @Override
    public String toString() {
        return "Resturant{" +
                "rateing='" + rateing + '\'' +
                ", address=" + address +
                ", resturantFeedBack='" + resturantFeedBack + '\'' +
                ", Name='" + Name + '\'' +
                ", dishList=" + dishList +
                '}';
    }
}
