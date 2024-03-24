public class BasicCalculator implements CalculatorService {
    private Logger logger;

    public BasicCalculator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Complex add(Complex num1, Complex num2) {
        Complex result = num1.add(num2);
        logger.log("Addition: " + num1 + " + " + num2 + " = " + result);
        return result;
    }

    @Override
    public Complex multiply(Complex num1, Complex num2) {
        Complex result = num1.multiply(num2);
        logger.log("Multiplication: " + num1 + " * " + num2 + " = " + result);
        return result;
    }

    @Override
    public Complex divide(Complex num1, Complex num2) {
        Complex result = num1.divide(num2);
        logger.log("Division: " + num1 + " / " + num2 + " = " + result);
        return result;
    }
}
