/*
Умножение двух матриц
 * Создайти два массива целых чисел размером (3х3).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив {{1,2,3}{1,1,1}{0,0,0}{2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */
import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int [][] array1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int [][] array2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int pos = array1.length;
        int post1 = array1[0].length;
        int post2 = array2[0].length;
        if (pos!=post2){
            System.out.println("Error");
        }else{
            System.out.println("Everything worked!");
        }
        int[][] arrayThird = new int[pos][post2];
        for (int i = 0; i < pos; i++){
            for(int j = 0; j < post2; j++){
                int sum = 0;
                for(int k = 0; k < post1; k++){
                    sum+=array1[i][k]*array2[k][j];
                }
                arrayThird[i][j]=sum;
            }
        }
        System.out.println(Arrays.deepToString(arrayThird));
    }
}
