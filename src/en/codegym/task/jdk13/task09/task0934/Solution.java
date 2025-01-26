package en.codegym.task.jdk13.task09.task0934;

/* 
Word palindrome
*/

public class Solution {
    public static void main(String[] args) {
        String word = "Rotor";
        String answer = isPalindrome(word) ? "Yes" : "No";
        System.out.println("Is the word \"" + word + "\" a palindrome? " + answer);
    }

    public static boolean isPalindrome(String word) {
        String wordSmall = word.toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < wordSmall.length() / 2; i++) {
            if (wordSmall.charAt(i) != wordSmall.charAt(wordSmall.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
