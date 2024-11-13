package en.codegym.task.jdk13.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Predictions
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.printf(name + " will receive " + number1 + " in " + number2 + " years.");
    }
}
