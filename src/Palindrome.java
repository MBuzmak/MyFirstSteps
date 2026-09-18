public class Palindrome {
    public static boolean isPalindrome(String text) {
        if (text.isEmpty()) {
            return false;
        }
        String clear = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reverse = new StringBuilder(clear).reverse().toString();
        if (clear.matches(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}
