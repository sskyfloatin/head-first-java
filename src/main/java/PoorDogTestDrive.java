public class PoorDogTestDrive {

    public static void main(String[] args) {
        PoorDog dog = new PoorDog();
        System.out.println(dog.getName()); //if string was not initialized it is null by default
        System.out.println(dog.getSize()); //if int was not initialized it is 0 by default

    }
}
