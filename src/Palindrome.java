public class Palindrome {
    public static void main(String[] args) {

        System.out.println(checkPalindrome("Sugus"));

    }

    public static boolean checkPalindrome(String word) {
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
