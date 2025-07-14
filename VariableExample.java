public class VariableExample {
    int instanceVar = 20;

    static int staticVar = 30;

    void display() {
        int localVar = 10;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariableExample obj = new VariableExample();
        obj.display();
    }
}
