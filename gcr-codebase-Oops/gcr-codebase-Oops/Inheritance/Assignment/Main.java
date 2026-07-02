class Fruit {
    String name;

    Fruit(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Apple extends Fruit {
    Apple(String name) {
        super(name);
    }
}

class Mango extends Fruit {
    Mango(String name) {
        super(name);
    }
}

class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}

public class Main {

    // Upper bounded wildcard
    public static void printFruit(Box<? extends Fruit> box) {
        Fruit fruit = box.get();
        System.out.println("Fruit: " + fruit);
    }

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(new Apple("Red Apple"));
        Box<Mango> mangoBox = new Box<>(new Mango("Alphonso Mango"));

        printFruit(appleBox);
        printFruit(mangoBox);
    }
}