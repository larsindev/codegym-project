package en.codegym.task.jdk13.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* 
Duplicating words
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String userInput = scanner.nextLine();
            list.add(userInput);
        }

        ArrayList<String> result = doubleValues(list);

        for (String doubleValue : result) {
            System.out.println(doubleValue);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> listCopy = new ArrayList<>();

        for (String str : list) {
            listCopy.add(str);
            listCopy.add(str);
        }

        return listCopy;
    }
}
