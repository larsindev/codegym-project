package en.codegym.task.jdk13.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Shuffled just in time
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String userInput = reader.readLine();
            strings.add(userInput);
        }

        ArrayList<String> stringsCopy = new ArrayList<>(strings);

        for (int i = 0; i < m; i++) {
            String temp = strings.get(i);
            stringsCopy.add(temp);
            stringsCopy.remove(0);
        }

        for (String str : stringsCopy) {
            System.out.println(str);
        }
    }
}
