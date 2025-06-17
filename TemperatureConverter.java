
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Convert to (C/F): ");
        String unit = scanner.next();

        if (unit.equalsIgnoreCase("C")) {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println("Result: " + celsius + " °C");
        } else if (unit.equalsIgnoreCase("F")) {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Result: " + fahrenheit + " °F");
        } else {
            System.out.println("Invalid unit.");
        }
    }
}
