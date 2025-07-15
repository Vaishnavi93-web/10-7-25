public class NonStaticExample {

    void displayMessage() {
        System.out.println("Hello, this is a non-static method called using an object.");
    }

    public static void main(String[] args) {
        NonStaticExample obj = new NonStaticExample();
        
        obj.displayMessage();
    }
}
