class Box<T> {
    T value;

    // Constructor
    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println(value);
    }
    public void set(T value) {
        this.value=value;
    }
    public T get(){
        return this.value;
    }

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        Box<String> b2 = new Box<>("Hello");

        b1.display();
        b2.display();
        b1.set(20);
        b2.set("llll");
        System.out.println(b1.get());
        System.out.println(b2.get());
    }
}
