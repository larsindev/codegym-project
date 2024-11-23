package en.codegym.task.jdk13.task02.task0216;

/* 
Minimum of three numbers
*/

public class Solution {
    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);

//        int min = 0;
//
//        if (a <= b) {
//            if (a <= c)
//                min = a;
//            else
//                min = c;
//        }
//        else if (b <= a) {
//            if (b <= c)
//                min = b;
//            else
//                min = c;
//        }
//
//        return min;

    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
