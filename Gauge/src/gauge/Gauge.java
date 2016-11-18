package gauge;

import java.util.Scanner;

public class Gauge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите что-то: ");
        String x = sc.nextLine();
        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            a++;
        }
        System.out.println(a);

        char cr = x.charAt(0);
        System.out.println("Первый символ: " + cr);
        int last = x.length() - 1;
        char ch = x.charAt(last);
        System.out.println("Второй символ: " + ch);

        int b = a % 2;
        if (b == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
