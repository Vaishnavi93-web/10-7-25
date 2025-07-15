class Car {
    void displayCar() {
        System.out.println("This is a Car.");
    }
}

class Bike extends Car {
    void displayBike() {
        System.out.println("This is a Bike.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Bike b = new Bike();

        b.displayCar();   // Method from parent class
        b.displayBike();  // Method from child class
    }
}
