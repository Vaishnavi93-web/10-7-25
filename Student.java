public class Student {
    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Vaishnavi";
        s1.age = 21;
        
        s1.displayDetails();
    }
}
