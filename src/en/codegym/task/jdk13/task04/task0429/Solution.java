package en.codegym.task.jdk13.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Positive and negative numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int positiveAmount = 0;
        int negativeAmount = 0;
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        List<Integer> numbers = new ArrayList<>();

        numbers.add(a);
        numbers.add(b);
        numbers.add(c);

        for (int number : numbers) {
            if (number > 0)
                positiveAmount++;
            else if (number < 0)
                negativeAmount++;
        }

        System.out.println("Number of positive numbers: " + positiveAmount);
        System.out.println("Number of negative numbers: " + negativeAmount);
    }
}
