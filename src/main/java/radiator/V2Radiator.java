package radiator;

import java.util.ArrayList;

public class V2Radiator {
    V2Radiator(ArrayList list) {
        for(int x=0; x < 5; x++) {
            list.add(new Simunit("V2radiator"));
            System.out.println("V2 Radiator "+ x);
        }
    }
}

