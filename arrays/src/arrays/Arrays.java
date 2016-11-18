/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        int i;
        int[][] myArray = new int[2][3];

        System.out.print("Введите любое целое число: ");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        int j = 0;
        for (int a = 0; a < i; a++) {
            int p = (int) (Math.random() * 9);
            System.out.print(p + " ");
            j += p;
        }

        System.out.println(" ");

        System.out.println(j);

        System.out.println("Записываем результат в массив: \n");
        for (int e = 0; e < 2; e++) {
            for (int h = 0; h < 3; h++) {
                myArray[e][h] = j;
            }

        }
        for (int g = 0; g < myArray.length; g++) {
            for (int k = 0; k < myArray[g].length; k++) {
                System.out.print(myArray[g][k] + " ");
            }
            System.out.println();
        }
    }

}
