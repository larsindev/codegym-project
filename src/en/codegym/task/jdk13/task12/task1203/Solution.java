package en.codegym.task.jdk13.task12.task1203;

/* 
Conscious choice
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(isByte(12)); // true
        System.out.println(isShort(130999)); // false
        System.out.println(isInt(1999939990L)); // true
        System.out.println(isInt(19999999939990L)); // false
    }

    public static boolean isByte(long l) {
        byte b = (byte) l;
        if (b == l)
            return true;
        else
            return false;
    }

    public static boolean isShort(long l) {
        short s = (short) l;
        if (s == l)
            return true;
        else
            return false;
    }

    public static boolean isInt(long l) {
        int i = (int) l;
        if (i == l)
            return true;
        else
            return false;
    }
}
