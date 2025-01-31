package en.codegym.task.jdk13.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;

/* 
Words in reverse
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        list.add(keyboard.readLine());
        list.add(keyboard.readLine());
        list.add(keyboard.readLine());
        list.add(keyboard.readLine());
        list.add(keyboard.readLine());

        list.remove(2);

        Collections.reverse(list);

        list.forEach(System.out::println);
    }
}
