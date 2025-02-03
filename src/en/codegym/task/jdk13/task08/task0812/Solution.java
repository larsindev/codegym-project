package en.codegym.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Longest sequence
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        numbers.add(Integer.parseInt(scanner.nextLine()));
        numbers.add(Integer.parseInt(scanner.nextLine()));
        numbers.add(Integer.parseInt(scanner.nextLine()));
        numbers.add(Integer.parseInt(scanner.nextLine()));
        numbers.add(Integer.parseInt(scanner.nextLine()));
        numbers.add(Integer.parseInt(scanner.nextLine()));
        numbers.add(Integer.parseInt(scanner.nextLine()));
        numbers.add(Integer.parseInt(scanner.nextLine()));
        numbers.add(Integer.parseInt(scanner.nextLine()));
        numbers.add(Integer.parseInt(scanner.nextLine()));

        int longestSequence = 0;
        int currentNumber = numbers.get(0);
        int currentSequence = 1;

        for (int i = 1; i < numbers.size(); i++) {
            if (currentNumber == numbers.get(i)) {
                currentSequence ++;
            } else {
                if (currentSequence > longestSequence) { longestSequence = currentSequence; }
                currentNumber = numbers.get(i);
                currentSequence = 1;
            }
        }

        // The last check outside the loop is crucial because if the longest sequence happens to be at the very end of the list, the loop itself won’t catch it.

        if (currentSequence > longestSequence) {
            longestSequence = currentSequence;
        }

        System.out.println(longestSequence);
    }
}
