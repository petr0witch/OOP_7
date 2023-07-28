package Operation.variable;

import Operation.Operation;

public class Split extends Operation {
    private double res;
    @Override
    public void operation(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Split by zero isn't possible.");
        }
        res = number1 / number2;
        System.out.printf("Result: %s / %s = %s\n", number1, number2, res);
    }
    @Override
    public String toString() {
        return "Result = " + res;
    }

}
