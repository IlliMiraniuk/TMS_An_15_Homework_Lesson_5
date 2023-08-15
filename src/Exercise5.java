/**
 * Создайте двумерный массив целых чисел. Отсортируйте элементы в
 * строках двумерного массива по возрастанию.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter pos number");
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
        int[][] sortArr = new int[pos][post];
        for (int i = 0; i < array.length; i++){
            Arrays.sort(array[i]);
            sortArr[i] = array[i];
        }
        System.out.println("sorted array " + Arrays.deepToString(sortArr));
    }
}
