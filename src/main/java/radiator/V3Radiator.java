package radiator;

import java.util.ArrayList;

public class V3Radiator extends V2Radiator {
    V3Radiator(ArrayList lglist) {
        super(lglist);
        for (int g = 0;g < 10; g++) {
            lglist.add(new Simunit("V3Radiator"));
            System.out.println("V3Radiator " + g);
        }
    }
}
