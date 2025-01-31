package en.codegym.task.jdk13.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Checking the order
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 10; i++) { words.add(scanner.nextLine()); }

        int smallestString = words.get(0).length();

        for (int i = 1; i < words.size(); i++) {
            String word = words.get(i);
            int wordLength = word.length();

            if (wordLength >= smallestString) {
                smallestString = wordLength; // need to update a larger string to be the new smallest string
                continue;
            } else {
                System.out.println(words.indexOf(word));
                break;
            }
        }
    }
}

