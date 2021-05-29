public class GoodDogTestDrive3 {

    public static void main(String[] args) {
        GoodDog3 one = new GoodDog3();
        one.setSize(60);
        GoodDog3 two = new GoodDog3();
        two.setSize(8);

        System.out.println("First dog's size is " + one.getSize());
        System.out.println("Second dog's size is " + two.getSize());

        one.bark();
        two.bark();
    }
}
