package en.codegym.task.jdk13.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Somewhere in the middle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a < b && b < c) || (c < b && b < a))
            System.out.print(b);
        else if ((b < a && a < c) || (c < a && a < b))
            System.out.print(a);
        else if (a == b || a == c)
            System.out.println(a);
        else if (b == c)
            System.out.println(b);
        else if (a == b && b == c)
            System.out.print(a);
        else
            System.out.print(c);
    }
}
