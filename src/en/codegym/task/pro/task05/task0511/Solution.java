package en.codegym.task.pro.task05.task0511;

/* 
Creating a two-dimensional array
*/

import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 0;

        while (true) {
            int input = scanner.nextInt();
            if (input > 0) {
                rows = input;
                break;
            }
        }

        multiArray = new int[rows][];

        int row = 0;

        while (row < rows) {
            int columns = scanner.nextInt();
            if (columns > 0) {
                multiArray[row] = new int[columns];
                row++;
            }
        }
    }
}
