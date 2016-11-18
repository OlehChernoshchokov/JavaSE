/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flipmatrix;

import java.util.Scanner;

public class FlipMatrix {

    public static void main(String[] args) {
        
        int[][] myArray = new int[4][4];
        for (int i = 0; i < 16; i++) {
            int a;
            System.out.print("Введите любое целое число: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            System.out.println();

            System.out.println("Записываем результат в массив: \n");
            for (int e = 0; e < 4; e++) {
                for (int h = 0; h < 4; h++) {
                    myArray[e][h] = a;
                    
                    
                }
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
