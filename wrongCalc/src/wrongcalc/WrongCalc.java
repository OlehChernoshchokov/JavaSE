package wrongcalc;

import java.util.Scanner;

public class WrongCalc {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        String a = number.nextLine();
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            int f = b;
            System.out.print(f);
        }
    }
}
