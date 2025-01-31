package en.codegym.task.jdk13.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Three arrays
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            int userInput = Integer.parseInt(keyboard.readLine());
            numbers.add(userInput);

            if (userInput % 3 == 0 && userInput % 2 == 0) {
                divBy3.add(userInput);
                divBy2.add(userInput);
            } else if (userInput % 3 == 0) {
                divBy3.add(userInput);
            } else if (userInput % 2 == 0) {
                divBy2.add(userInput);
            } else {
                others.add(userInput);
            }
        }

        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        list.forEach(System.out::println);
    }
}
