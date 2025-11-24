import java.util.*;

class Animal { String name; Animal(String name){this.name=name;} }
class Dog extends Animal { Dog(String name){ super(name); } }
class Cat extends Animal { Cat(String name){ super(name); } }

public class AnimalListPrinter {
    public static void printAnimals(List<? extends Animal> animals) {
        for(Animal a : animals) System.out.println(a.name);
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog("Rex"), new Dog("Buddy"));
        List<Cat> cats = Arrays.asList(new Cat("Kitty"), new Cat("Mittens"));

        System.out.println("Dogs:");
        printAnimals(dogs);
        System.out.println("Cats:");
        printAnimals(cats);
    }
}