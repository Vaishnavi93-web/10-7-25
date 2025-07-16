class Parent {
    String message = "Hello from Parent class!";
}

class Child extends Parent {
    String message = "Hello from Child class!";

    void displayMessages() {
        System.out.println("Child message: " + message);         
        System.out.println("Parent message: " + super.message);  
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child c = new Child();

        c.displayMessages();
    }
}
