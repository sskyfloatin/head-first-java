package radiator;

import java.util.ArrayList;

public class TestLifeSupportSim {
    public static void main(String[] args) {
        ArrayList alist = new ArrayList();
        V2Radiator v2 = new V2Radiator(alist);
        V3Radiator v3 = new V3Radiator(alist);
        for(int x = 0;x < 20; x++) {
            RetentionBot ret = new RetentionBot(alist);
        }
    }
}
