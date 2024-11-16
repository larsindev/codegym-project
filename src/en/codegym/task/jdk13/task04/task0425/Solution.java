package en.codegym.task.jdk13.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Quadrants
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        if (x > 0 && y > 0)
            System.out.print("1");
        else if (x < 0 && y > 0)
            System.out.print("2");
        else if (x < 0 && y < 0)
            System.out.print("3");
        else if (x > 0 && y < 0)
            System.out.print("4");
    }
}
