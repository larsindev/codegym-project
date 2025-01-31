package en.codegym.task.jdk13.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        boolean userHasntTypedEnd = true;

        while (userHasntTypedEnd) {
            String userInput = reader.readLine();
            if (userInput.equalsIgnoreCase("end")) {
                userHasntTypedEnd = false;
                continue;
            }
            strings.add(userInput);
        }

        for (String string : strings) {
            System.out.println(string);
        }

    }
}