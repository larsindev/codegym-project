package en.codegym.task.jdk13.task07.task0707;

import java.util.ArrayList;

/* 
5 different strings in a list
*/

public class Solution {

    public static ArrayList<String> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        for (int i = 0; i < 5; i++) { list.add("Mike" + i); }
        System.out.println(list.size());
        for (String name : list) {
            System.out.println(name);
        }
    }
}
