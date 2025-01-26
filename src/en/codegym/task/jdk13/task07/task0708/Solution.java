package en.codegym.task.jdk13.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/* 
The largest number
*/

public class Solution {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            integers.add(scanner.nextInt());
        }

        int max = integers.get(0);

//        for (int i = 0; i < integers.size(); i++) {
//            if (integers.get(i) > max)
//                max = integers.get(i);
//        }

        for (Integer integer : integers) {
            if (integer > max)
                max = integer;
        }

        System.out.println(max);
    }
}
