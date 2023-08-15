/**
 * Шахматная доска
 *         Создать программу для раскраски шахматной доски с помощью цикла.
 *         Создать двумерный массив String'ов 8х8. С помощью циклов задать
 *         элементам циклам значения B(Black) или W(White).

 */


public class Exercise1 {
    public static void main(String[] args) {
        int n = 8;
        String[][] board = new String[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                if ((i % 2 == 0) && (k % 2 == 0)||(i % 2 != 0) && (k % 2 != 0)) {
                    board[i][k] = "W";
                } else {
                    board[i][k] = "B";
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                System.out.print(" " +board[i][k]+" ");}
            System.out.println();
        }
    }
}

