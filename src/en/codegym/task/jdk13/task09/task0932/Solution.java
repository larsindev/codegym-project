package en.codegym.task.jdk13.task09.task0932;

/* 
Number of words in a string
*/

import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        String string = "Who wants a job?";
        int getWordCount = getWordCount(string);
        System.out.println("The number of words in the string \"" + string + "\" is " + getWordCount);
    }

    public static int getWordCount(String string) {
        int wordCount = 0;
        StringTokenizer tokenizer = new StringTokenizer(string," ");
        while (tokenizer.hasMoreTokens())
        {
            tokenizer.nextToken();
            wordCount++;
        }
        return wordCount;
    }
}
