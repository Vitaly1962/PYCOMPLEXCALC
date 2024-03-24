import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = new Logger("log.txt");
        CalculatorService calculator = new BasicCalculator(logger);

        // Input for the first complex number
        System.out.println("Введите первое комплексное число (действительная и мнимая части, разделенные пробелом): ");
        Complex num1 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        // Input for the second complex number
        System.out.println("Введите второе комплексное число (действительная и мнимая части, разделенные пробелом): ");
        Complex num2 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        // Input for the operator
        System.out.println("Enter the operator (+, *, /): ");
        String operator = scanner.next();

        Complex result;
        switch (operator) {
            case "+":
                result = calculator.add(num1, num2);
                break;
            case "*":
                result = calculator.multiply(num1, num2);
                break;
            case "/":
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
