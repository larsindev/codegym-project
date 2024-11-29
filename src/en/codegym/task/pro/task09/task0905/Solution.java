package en.codegym.task.pro.task09.task0905;

/* 
Octal converter
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 123;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 123;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int octalNumber = 0;
        int exponent = 0;
        if (decimalNumber <= 0) { return 0; } {
            while (decimalNumber != 0) {
                octalNumber += (int) (decimalNumber % 8 * Math.pow(10, exponent));
                decimalNumber /= 8;
                exponent++;
            }
            return octalNumber;
        }
    }

    public static int toDecimal(int octalNumber) {
        int decimalNumber = 0;
        if (octalNumber <= 0) { return 0; }
        else {
            String numberStr = String.valueOf(octalNumber);
            int[] digits = new int[numberStr.length()];
            for (int i = 0; i < numberStr.length(); i++) {
                digits[i] = Character.getNumericValue(numberStr.charAt(i));;
            }
            for (int i = 0; i < digits.length; i++) {
                decimalNumber += (int) (digits[digits.length - i - 1] * Math.pow(8, i));
            }
            return decimalNumber;
        }
    }
}
