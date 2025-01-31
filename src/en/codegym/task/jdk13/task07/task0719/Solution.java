package en.codegym.task.jdk13.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Display numbers in reverse order
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(Integer.parseInt(reader.readLine()));
        numbers.add(Integer.parseInt(reader.readLine()));
        numbers.add(Integer.parseInt(reader.readLine()));
        numbers.add(Integer.parseInt(reader.readLine()));
        numbers.add(Integer.parseInt(reader.readLine()));
        numbers.add(Integer.parseInt(reader.readLine()));
        numbers.add(Integer.parseInt(reader.readLine()));
        numbers.add(Integer.parseInt(reader.readLine()));
        numbers.add(Integer.parseInt(reader.readLine()));
        numbers.add(Integer.parseInt(reader.readLine()));

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}
