package en.codegym.task.jdk13.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Positive and negative numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int readNumber = Integer.parseInt(reader.readLine());

        if (readNumber > 0) {
            readNumber *= 2;
        } else if (readNumber < 0) {
            readNumber += 1;
        } else {
            readNumber = 0;
        }

        System.out.println(readNumber);
    }

}