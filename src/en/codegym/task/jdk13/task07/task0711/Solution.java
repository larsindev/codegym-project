package en.codegym.task.jdk13.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());

        for (int i = 0; i < 13; i++) {
            int lastStringIndex = strings.size() - 1;
            String temp = strings.get(lastStringIndex);
            strings.remove(lastStringIndex);
            strings.add(0, temp);
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
