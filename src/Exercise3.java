/**
 * Создайте двумерный массив целых чисел.
 * Выведите на консоль сумму всех элементов массива
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter position number");
        int pos = scanner.nextInt();
        System.out.println("Enter post number");
        int post = scanner.nextInt();
        int [][] array = new int[pos][post];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random()*10);
            }
        }
        System.out.println(Arrays.deepToString(array));
        int amo = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                amo +=array[i][j];
            }
        }
        System.out.println("The total amount will be: " + amo);
    }
}
