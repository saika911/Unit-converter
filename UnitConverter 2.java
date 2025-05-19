import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Unit Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Meters to Kilometers");
        System.out.println("4. Kilometers to Meters");
        System.out.println("5. Miles to Kilometers");
        System.out.println("6. Kilometers to Miles");
        System.out.println("7. Kilograms to Pounds");
        System.out.println("8. Pounds to Kilograms");
        System.out.println("9. Seconds to Minutes");
        System.out.println("10. Minutes to Hours");

        System.out.print("Enter your choice (1-10): ");
        int choice = scanner.nextInt();
        double input, result;

        switch (choice) {
            case 1:
                System.out.print("Enter Celsius: ");
                input = scanner.nextDouble();
                result = Conversions.celsiusToFahrenheit(input);
                System.out.println(input + " Celsius = " + result + " Fahrenheit");
                break;

            case 2:
                System.out.print("Enter Fahrenheit: ");
                input = scanner.nextDouble();
                result = Conversions.fahrenheitToCelsius(input);
                System.out.println(input + " Fahrenheit = " + result + " Celsius");
                break;

            case 3:
                System.out.print("Enter Meters: ");
                input = scanner.nextDouble();
                result = Conversions.metersToKilometers(input);
                System.out.println(input + " Meters = " + result + " Kilometers");
                break;

            case 4:
                System.out.print("Enter Kilometers: ");
                input = scanner.nextDouble();
                result = Conversions.kilometersToMeters(input);
                System.out.println(input + " Kilometers = " + result + " Meters");
                break;

            case 5:
                System.out.print("Enter Miles: ");
                input = scanner.nextDouble();
                result = Conversions.milesToKilometers(input);
                System.out.println(input + " Miles = " + result + " Kilometers");
                break;

            case 6:
                System.out.print("Enter Kilometers: ");
                input = scanner.nextDouble();
                result = Conversions.kilometersToMiles(input);
                System.out.println(input + " Kilometers = " + result + " Miles");
                break;

            case 7:
                System.out.print("Enter Kilograms: ");
                input = scanner.nextDouble();
                result = Conversions.kilogramsToPounds(input);
                System.out.println(input + " Kilograms = " + result + " Pounds");
                break;

            case 8:
                System.out.print("Enter Pounds: ");
                input = scanner.nextDouble();
                result = Conversions.poundsToKilograms(input);
                System.out.println(input + " Pounds = " + result + " Kilograms");
                break;

            case 9:
                System.out.print("Enter Seconds: ");
                input = scanner.nextDouble();
                result = Conversions.secondsToMinutes(input);
                System.out.println(input + " Seconds = " + result + " Minutes");
                break;

            case 10:
                System.out.print("Enter Minutes: ");
                input = scanner.nextDouble();
                result = Conversions.minutesToHours(input);
                System.out.println(input + " Minutes = " + result + " Hours");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
