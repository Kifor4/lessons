package les5.task1;

public class Calculator {
    Factory factory = new Factory();
    Logger consoleLogger = factory.getLogger(LoggerType.CONSOLE);
    Logger fileLogger = factory.getLogger(LoggerType.FILE);
    Logger dbLogger = factory.getLogger(LoggerType.DATABASE);
    double addition(double a, double b) {
        double result = a + b;
        consoleLogger.log("" + result);
        fileLogger.log("" + result);
        dbLogger.log("" + result);
        return result;
    }
    double subtraction(double a, double b) {
        double result = a - b;
        consoleLogger.log("" + result);
        fileLogger.log("" + result);
        dbLogger.log("" + result);
        return result;
    }
    double multiplication(double a, double b) {
        double result = a * b;
        consoleLogger.log("" + result);
        fileLogger.log("" + result);
        dbLogger.log("" + result);
        return result;
    }
    double division(double a, double b) {
        double result = a / b;
        consoleLogger.log("" + result);
        fileLogger.log("" + result);
        dbLogger.log("" + result);
        return result;
    }
}
