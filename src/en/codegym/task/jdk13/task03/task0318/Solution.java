package en.codegym.task.jdk13.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
How to take over the world
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age = reader.readLine();

        System.out.println(name + " will take over the world in " + Integer.parseInt(age) + " years. Mwa-ha-ha!");
    }
}
