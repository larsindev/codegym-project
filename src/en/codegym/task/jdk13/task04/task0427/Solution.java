package en.codegym.task.jdk13.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Describing numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number > 0 && number < 10 && number % 2 == 0) {
            System.out.println("even single-digit number");
        } else if (number > 0 && number < 10) {
            System.out.println("odd single-digit number");
        } else if (number > 9 && number < 100 && number % 2 == 0) {
            System.out.println("even two-digit number");
        } else if (number > 9 && number < 100) {
            System.out.println("odd two-digit number");
        } else if (number > 99 && number < 1000 && number % 2 == 0) {
            System.out.println("even three-digit number");
        } else if (number > 99 && number < 1000) {
            System.out.println("odd three-digit number");
        }
    }
}
