package en.codegym.task.pro.task09.task0907;

/* 
Hexadecimal converter
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        StringBuilder hexRepresentation = new StringBuilder();
        if (decimalNumber <= 0) { return ""; }
        else {
            int index = 0;
            while (decimalNumber != 0) {
                hexRepresentation.append((HEX.charAt(decimalNumber % 16)));
                decimalNumber /= 16;
            }
        }
        return hexRepresentation.reverse().toString();
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null) { return 0; }
        int decimalNumber = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            decimalNumber += (int) (HEX.indexOf(hexNumber.charAt(i)) * Math.pow(16, hexNumber.length() - i - 1));
        }
        return decimalNumber;
    }


}
