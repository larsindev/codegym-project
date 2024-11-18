    package en.codegym.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Street and houses
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            int userInput = Integer.parseInt(reader.readLine());
            numbers[i] = userInput;
            if (i % 2 == 0)
                sumEven += userInput;
            else
                sumOdd += userInput;
        }

        if (sumEven > sumOdd)
            System.out.println("Even-numbered houses have more residents.");
        else if (sumOdd > sumEven)
            System.out.println("Odd-numbered houses have more residents.");
    }
}
