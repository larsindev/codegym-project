package en.codegym.task.jdk13.task08.task0802;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Map of 10 pairs
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("watermelon", "melon");
        map.put("banana", "fruit");
        map.put("cherry", "fruit");
        map.put("pear", "fruit");
        map.put("cantaloupe", "melon");
        map.put("blackberry", "fruit");
        map.put("ginseng", "root");
        map.put("strawberry", "fruit");
        map.put("iris", "flower");
        map.put("potato", "tuber");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
