package en.codegym.task.jdk13.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Maximum and minimum numbers in an array
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];

        for (int i = 0; i < 20; i++) {
            int userInput = Integer.parseInt(reader.readLine());
            list[i] = userInput;
        }

        int maximum = list[0];
        int minimum = list[0];

        for (int i = 1; i < list.length; i++) {
            int currentNumber = list[i];
            if (currentNumber > maximum) { maximum = currentNumber; }
            if (currentNumber < minimum) { minimum = currentNumber; }
        }

        System.out.print(maximum + " " + minimum);
    }
}
