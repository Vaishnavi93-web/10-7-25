public class Employee2 {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;      
        this.salary = salary;  
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Vaishnavi", 50000);

        emp.displayDetails();
    }
}
