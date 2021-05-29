public class GoodDogTestDrive2 {

    public static void main(String[] args) {
        GoodDog2 one = new GoodDog2();
        one.setSize(70);
        GoodDog2 two = new GoodDog2();
        two.setSize(8);
        System.out.println("First dog size is " + one.getSize());
        System.out.println("Second dog size is "+ two.getSize());

        one.bark();
        two.bark();
    }
}
