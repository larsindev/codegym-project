package en.codegym.task.jdk13.task04.task0433;

/* 
Seeing dollars in your future
*/

public class Solution {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            int i = 0;
            while (i < 10) {
                System.out.print("$");
                i++;
            }
            System.out.println();
            counter++;
        }
    }
}
