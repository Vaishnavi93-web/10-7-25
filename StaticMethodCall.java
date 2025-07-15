class Utility {
    public static void greet() {
        System.out.println("Hello! This is a static method from Utility class.");
    }
}
public class StaticMethodCall {
    public static void main(String[] args) {
        Utility.greet();
    }
}
