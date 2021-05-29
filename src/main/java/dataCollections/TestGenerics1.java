package dataCollections;

import java.util.ArrayList;

public class TestGenerics1 {

    public static void main(String[] args) {
        new TestGenerics1().go();
    }

    public void go() {
//        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

//        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(animals);
//        takeAnimals(dogs);
    }

//    public void takeAnimals(Animal[] animals) {
    public void takeAnimals(ArrayList<Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }

    abstract class Animal {
        void eat() {
            System.out.println("Animal eat");
        }
    }

    class Dog extends Animal {
        void meow() {}
    }

    class Cat extends Animal {
        void bark() {}
    }
}
