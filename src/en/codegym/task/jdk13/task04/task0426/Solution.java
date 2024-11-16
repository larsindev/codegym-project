package en.codegym.task.jdk13.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Labels and numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0 && number % 2 == 0)
            System.out.print("Negative even number");
        else if (number < 0)
            System.out.print("Negative odd number");
        else if (number > 0 && number % 2 == 0)
            System.out.print("Positive even number");
        else if (number > 0)
            System.out.print("Positive odd number");
        else
            System.out.print("Zero");
    }
}
