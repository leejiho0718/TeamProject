package youngrokproject;
import java.util.Scanner;

public class A_project {

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = (5.0/9.0) * (fahrenheit - 32);
        
        System.out.println("Temperature in Celsius: " + celsius + "C");
        
        scanner.close();
    }
}