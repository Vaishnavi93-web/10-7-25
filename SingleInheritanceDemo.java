class Parent {
    void showParent() {
        System.out.println("This is the Parent class method.");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("This is the Child class method.");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Child c = new Child();
        
        c.showParent();
        
        c.showChild();
    }
}
