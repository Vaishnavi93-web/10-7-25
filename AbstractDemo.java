abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        c.area(); 

        Shape r = new Rectangle(4, 6);
        r.area(); 
    }
}
