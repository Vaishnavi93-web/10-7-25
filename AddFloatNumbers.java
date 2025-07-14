import java.util.Scanner;

public class AddFloatNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first float number: ");
        float num1 = sc.nextFloat();
        
        System.out.print("Enter second float number: ");
        float num2 = sc.nextFloat();
        
        float sum = num1 + num2;
        
        System.out.println("The sum of the two float numbers is: " + sum);
        
        sc.close();
    }
}
