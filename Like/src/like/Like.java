package like;

import java.util.Scanner;

public class Like {

    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.print("Введите x: ");
        String x = sx.nextLine();
        Scanner sy = new Scanner(System.in);
        System.out.print("Введите y: ");
        String y = sy.nextLine();
        String result;
        result = "I like " + x + " because " + y;
        System.out.println(result);
    }
}
