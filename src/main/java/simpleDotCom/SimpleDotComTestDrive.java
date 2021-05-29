package simpleDotCom;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        DotCom dotCom = new DotCom();

        ArrayList<String> locationCells = new ArrayList<String>();
        locationCells.add("one");
        locationCells.add("two");
        locationCells.add("three");

        dotCom.setLocationCells(locationCells);

        String guess = "two";

        String result = dotCom.checkYourself(guess);
    }
}
