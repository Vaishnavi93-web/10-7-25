public class Student {
    String name;
    int age;


    Student() {
        this("Unknown", 0); 
        System.out.println("Default constructor called.");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called.");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayDetails();

        System.out.println("----------------------");

        Student s2 = new Student("Vaishnavi", 21);
        s2.displayDetails();
    }
}
