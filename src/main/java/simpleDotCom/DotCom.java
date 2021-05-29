package simpleDotCom;

import java.util.*;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locations) {
        locationCells = locations;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {

        String result = "мимо";

        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index) ;

            if (locationCells.isEmpty()) {
                result = "потопил";
                System.out.println("Ой, вы потопили "+ name + " : ( ");
            } else
            {
                result = "попал";
            }
        }

        return result;
    }

}
