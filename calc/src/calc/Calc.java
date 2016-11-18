package calc;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double firstValue;
        double secondValue;
        String operator;

        System.out.print("Введите число: ");

        firstValue = read.nextDouble();
        System.out.print("Введите оператор: ");
        operator = read.next();
        System.out.print("Введите второе число: ");
        secondValue = read.nextDouble();

        if (operator.equals("*")) {
            System.out.println("= " + (firstValue * secondValue));
        }
        if (operator.equals("/")) {
            System.out.println("= " + (firstValue / secondValue));
        }
        if (operator.equals("+")) {
            System.out.println("= " + (firstValue + secondValue));
        }
        if (operator.equals("-")) {
            System.out.println("= " + (firstValue - secondValue));
        }
        if (operator.equals("%")) {
            System.out.println("= " + ((firstValue * secondValue) / 100 ));
        }
    }
}
