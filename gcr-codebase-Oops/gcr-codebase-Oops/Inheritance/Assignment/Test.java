interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {

    public void show() {
        System.out.println("Show");
    }

    public void display() {
        System.out.println("Display");
    }

    public static void main(String[] args) {
        Test obj = new Test();

        obj.show();
        obj.display();
    }
}