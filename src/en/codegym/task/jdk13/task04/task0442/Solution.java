package en.codegym.task.jdk13.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Adding
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isNegative = false;
        int sum = 0;

        while (!isNegative) {
            int number = Integer.parseInt(reader.readLine());

            if (number != -1)
                sum += number;
            else {
                sum -= 1;
                isNegative = true;
            }
        }

        System.out.print(sum);
    }
}
