import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = new Logger("log.txt");
        CalculatorService calculator = new BasicCalculator(logger);

        // Ввод первого комплексного числа
        System.out.println("Введите первое комплексное число (действительная и мнимая части через пробел): ");
        Complex num1 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        // Ввод второго комплексного числа
        System.out.println("Введите второе комплексное число (действительная и мнимая части через пробел): ");
        Complex num2 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        // Ввод оператора
        System.out.println("Введите оператор (+, *, /): ");
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
                System.out.println("Недопустимый оператор!");
                return;
        }

        System.out.println("Результат: " + result);


    }
}