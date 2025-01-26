package en.codegym.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[tokenizer.countTokens()];
        int counter = 0;
        while (tokenizer.hasMoreTokens()) {
            result[counter] = tokenizer.nextToken();
            counter++;
        }
        return result;
    }
}
