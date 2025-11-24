import java.util.*;

class Fruit { String name; Fruit(String name){this.name=name;} }
class Apple extends Fruit { Apple(){ super("Apple"); } }
class Mango extends Fruit { Mango(){ super("Mango"); } }

class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();
    public void add(T fruit) { fruits.add(fruit); }
    public void display() {
        for(T f : fruits) System.out.println(f.name);
    }
}

public class TestFruitBox {
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Mango());
        box.display();

        // box.add(new Car()); // Won't compile, Car is not a Fruit
    }
}