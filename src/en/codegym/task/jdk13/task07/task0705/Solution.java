package en.codegym.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        int[] numbers2 = new int[10];
        int[] numbers3 = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i < 10)
                numbers2[i] = numbers[i];
            else
                numbers3[i - 10] = numbers[i];
        }

        for (int number : numbers3) { System.out.println(number); }
    }
}
