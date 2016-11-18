package cycles;

import java.util.Scanner;

public class Cycles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.print("Натуральные числа: ");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + "; ");
        }
        System.out.println();
        System.out.print("Делятся на 3 без остатка: ");
        for (int i = 1; i <= number; i++) {
            int a = i % 3;
            if (a == 0) {
                System.out.print(i + "; ");
            }
        }
        System.out.println();
        System.out.println();

        int b = 1;
        System.out.print("Натуральные числа(do-while): ");
        do {
            System.out.print(b + "; ");
            b++;
        } while (b <= number);

        System.out.println();
        
        b = 1;
        System.out.print("Делятся на 3 без остатка (do-while): ");
        do {
            int c = b % 3;
            if (c == 0) {
                System.out.print(b + "; ");
                
            }
            b++;
        } while (b <= number);

    }

}
