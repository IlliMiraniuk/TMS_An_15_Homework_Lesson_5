/**
 * Создайте двумерный массив целых чисел.
 * Выведите на консоль диагонали массива
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
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
        System.out.println("diagonal ");
        for(int i =0; i < array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                if(i==j){
                    System.out.print(" " + array[i][j]);
                }
            }
        }
        System.out.println("\n");
        System.out.println("diagonal 2 ");
        int maximum = array.length - 1;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i + j == maximum){
                    System.out.print(" " + array[i][j]);
                }
            }
        }
    }
}
