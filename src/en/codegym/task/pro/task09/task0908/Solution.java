//package en.codegym.task.pro.task09.task0908;
//
///*
//Binary to hexadecimal converter
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        String binaryNumber = "100111010000";
//        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
//        String hexNumber = "9d0";
//        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
//    }
//
//    public static String toHex(String binaryNumber) {
//        if (binaryNumber == null || !binaryNumber.matches("[0-1]+")) { return ""; }
//        else {
//            StringBuilder stringBuilder = new StringBuilder(binaryNumber);
//            StringBuilder decimalNumber = new StringBuilder();
//            while (stringBuilder.length() % 4 != 0) {
//                stringBuilder.insert(0, "0");
//            }
//            for (int i = 0; i <stringBuilder.length(); i += 4) {
//                decimalNumber.append();
//            }
//        }
//    }
//
//    public static String toBinary(String hexNumber) {
//        if (hexNumber == null || !hexNumber.matches("[0-9a-f]+")) { return ""; }
//        return " ";
//    }
//}
