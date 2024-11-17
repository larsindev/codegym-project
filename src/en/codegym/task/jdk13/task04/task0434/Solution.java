package en.codegym.task.jdk13.task04.task0434;

/* 
Multiplication table
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.print("\n");
        }
    }
}
