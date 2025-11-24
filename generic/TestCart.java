import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }
    public void displayItems() { System.out.println(items); }
}

class Electronics { String name; Electronics(String name){this.name=name;} public String toString(){return name;} }
class Clothing { String name; Clothing(String name){this.name=name;} public String toString(){return name;} }

public class TestCart {
    public static void main(String[] args) {
        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Laptop"));
        electronicsCart.addItem(new Electronics("Phone"));
        electronicsCart.displayItems();

        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("Shirt"));
        clothingCart.addItem(new Clothing("Jeans"));
        clothingCart.displayItems();
    }
}