package overriding;

public class Vampire extends Monster{
    @Override
    boolean frighten(int x) {
        System.out.println("Укусить?");
        return false;
    }

//    int frighten (int x) {
//        System.out.println("Гррррррррр");
//        return 1;
//    }

//    boolean scare (int x) {
//        System.out.println("Укусить?");
//        return  true;
//    }
}
