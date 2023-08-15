/** Создать трехмерный массив из целых чисел.
 С помощью циклов "пройти" по всему массиву и увеличить каждый
 элемент на заданное число. Пусть число, на которое будет
 увеличиваться каждый элемент, задается из консоли.
 */

import java.util.Scanner;

public class Exercise0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much do you want to enlarge the element? : ");
        int q = sc.nextInt();
        int[][][] array = {{{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += q;
                    System.out.print(" " + array[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}

