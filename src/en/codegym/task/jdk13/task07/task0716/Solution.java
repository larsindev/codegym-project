package en.codegym.task.jdk13.task07.task0716;

import java.util.ArrayList;

/* 
R or L
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("rose");
        strings.add("love");
        strings.add("lyra");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> fixedList = new ArrayList<String>(strings);
        for (String string : strings) {
            if (string.contains("l") && string.contains("r")) {
                continue;
            }
            if (string.contains("r")) {
                fixedList.remove(string);
            }
            if (string.contains("l")) {
                fixedList.add(fixedList.indexOf(string), string);
            }
        }
        return fixedList;
    }
}