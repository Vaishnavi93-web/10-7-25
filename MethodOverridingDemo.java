class Parent {
    void showMessage() {
        System.out.println("This is the Parent class method.");
    }
}

class Child extends Parent {
    void showMessage() {
        System.out.println("This is the Child class method.");

        super.showMessage();
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Child c = new Child();

        c.showMessage();
    }
}
