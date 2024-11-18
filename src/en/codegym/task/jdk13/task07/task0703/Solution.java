package en.codegym.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
2 arrays
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < strings.length; i++) {
            String userInput = reader.readLine();
            strings[i] = userInput;
            numbers[i] = userInput.length();
        }

        for (int number : numbers) { System.out.println(number); }
    }
}
