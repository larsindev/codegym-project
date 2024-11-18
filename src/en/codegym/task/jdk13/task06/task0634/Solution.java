package en.codegym.task.jdk13.task06.task0634;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Chess board
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        array = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        array[i][j] = '#';
                    else
                        array[i][j] = ' ';
                } else {
                    if (j % 2 == 0)
                        array[i][j] = ' ';
                    else
                        array[i][j] = '#';
                }
            }
        }

        for (char[] row : array) { System.out.println(row); }

    }
}
