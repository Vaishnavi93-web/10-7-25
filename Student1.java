public class Student1 {
    String name;
    int age;
    String course;

    Student() {
        name = "Unknown";
        age = 0;
        course = "Not assigned";
    }

    Student(String n, int a) {
        name = n;
        age = a;
        course = "Not assigned";
    }

    Student(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayDetails();

        Student s2 = new Student("Vaishnavi", 21);
        s2.displayDetails();

        Student s3 = new Student("Amit", 22, "Java Programming");
        s3.displayDetails();
    }
}
