class Parent {
    Parent() {
        System.out.println("Parent class constructor called.");
    }
}

class Child extends Parent {
    Child() {
        super();  // Calls Parent class constructor
        System.out.println("Child class constructor called.");
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
