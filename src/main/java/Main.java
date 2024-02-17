import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            String command = scanner.next();

            if (command.equals("quit") || command.equals("exit")) {
                break;
            }

            if (command.equals("add")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int result = calculator.add(a, b);
                System.out.println(result);
            } else if (command.equals("subtract")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int result = calculator.subtract(a, b);
                System.out.println(result);
            } else if (command.equals("multiply")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int result = calculator.multiply(a, b);
                System.out.println(result);
            } else if (command.equals("divide")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int result = calculator.divide(a, b);
                System.out.println(result);
            } else if (command.equals("fibonacci")) {
                int n = scanner.nextInt();
                int result = calculator.fibonacciNumberFinder(n);
                System.out.println(result);
            } else if (command.equals("binary")) {
                int number = scanner.nextInt();
                String result = calculator.intToBinaryNumber(number);
                System.out.println(result);
            }
        }
        
        scanner.close();
    }
}
