package Operation.variable;

import Operation.Operation;

public class Summarize extends Operation {
    Summarize summarize;
    private double res;
    @Override
    public void operation(double number1, double number2) {
        res = number1 + number2;
        System.out.printf("Result: %s + %s = %s\n", number1, number2, res);
    }
    @Override
    public String toString() {
        return "Result = " + res;
    }
}
