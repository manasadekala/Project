package org.example;

public class ResturantService {
    public Resturant getResturant(ListOfResturant listOfResturant ,String resturantName){

        for (int i=0;i<=listOfResturant.resturants.size();i++){
            if(listOfResturant.resturants.get(i).Name.equalsIgnoreCase(resturantName)){








                

                return listOfResturant.resturants.get(i);

            }

        }
        return null;

    }
}


