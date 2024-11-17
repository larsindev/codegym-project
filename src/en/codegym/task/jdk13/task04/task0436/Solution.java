package en.codegym.task.jdk13.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Drawing a rectangle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("8");
            }
            System.out.print("\n");
        }
    }
}
