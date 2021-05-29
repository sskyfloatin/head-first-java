package radiator;

public class Simunit {
    String botType;
    Simunit(String type) {
        botType = type;
    }
    int powerUse() {
        if ("Heating machine".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
}
