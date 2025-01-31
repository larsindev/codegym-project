package en.codegym.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Minimum or maximum
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());

        int shortestStringLength = Integer.MAX_VALUE;
        int longestStringLength = Integer.MIN_VALUE;

        for (String string : strings) {
            if (shortestStringLength > string.length()) {
                shortestStringLength = string.length();
            }
            if (longestStringLength < string.length()) {
                longestStringLength = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == shortestStringLength) {
                System.out.println(string);
                break;
            }
            if (string.length() == longestStringLength) {
                System.out.println(string);
                break;
            }
        }
    }
}
