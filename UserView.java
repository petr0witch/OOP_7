import Operation.variable.Multiply;
import Operation.variable.Split;
import Operation.variable.Subtract;
import Operation.variable.Summarize;

import java.util.Scanner;

public class UserView {
    double first;
    double second;
    char sign;
    public void run() {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first num: ");
            first = sc.nextInt();

            System.out.println("Choose operation (+, -, *, /): ");
            sign = sc.next().charAt(0);

            System.out.println("Enter second num: ");
            second = sc.nextInt();

            switch (sign) {
                case '+' -> {
                    Summarize summarize = new Summarize();
                    summarize.operation(first, second);
                }
                case '-' -> {
                    Subtract subtract = new Subtract();
                    subtract.operation(first, second);
                }
                case '*' -> {
                    Multiply multiply = new Multiply();
                    multiply.operation(first, second);
                }
                case '/' -> {
                    Split split = new Split();
                    split.operation(first, second);
                }
                default -> run();
            }
        }
    }
}
