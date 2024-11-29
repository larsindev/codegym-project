package en.codegym.task.pro.task09.task0906;

/* 
Binary converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 1425454555;
        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
        String binaryNumber = "101011110101";
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) { return ""; }
        else {
            StringBuilder binaryRepresentation = new StringBuilder();
            while (decimalNumber != 0) {
                binaryRepresentation.append(decimalNumber % 2);
                decimalNumber /= 2;
            }
            return binaryRepresentation.reverse().toString();
        }
    }

    public static int toDecimal(String binaryNumber) {
        // Null check needs to go first, since .isEmpty() would throw a NullPointerException
        if (binaryNumber == null ||binaryNumber.isEmpty()) { return 0; }
        else {
            int decimalNumber = 0;
            StringBuilder binaryNumberBuilder = new StringBuilder(binaryNumber);
            for (int i = 0; i < binaryNumberBuilder.length(); i++) {
                if (binaryNumberBuilder.charAt(binaryNumberBuilder.length() - i - 1) == '1') {
                    decimalNumber += (int) Math.pow(2, i);
                }
            }
            return decimalNumber;
        }
    }
}
