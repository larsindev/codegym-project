package en.codegym.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int shortestStringLength = Integer.MAX_VALUE;

        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());

        for (String string : strings) {
            if (string.length() < shortestStringLength) {
                shortestStringLength = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == shortestStringLength)
                System.out.println(string);
        }
    }
}
