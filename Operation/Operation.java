package Operation;

public abstract class Operation implements InterfaceOperation{
    Operation operation;
    public double calculate(double number1, double number2) {
        if (operation == null) {
            throw new IllegalStateException("Operation is not set.");
        }
        return operation.calculate(number1, number2);
    }
}
