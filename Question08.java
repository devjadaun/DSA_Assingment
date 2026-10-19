import java.util.Scanner;

public class Question08 {
    static boolean isPalindrome(String value, int left, int right) {
        if (left >= right) return true;
        if (value.charAt(left) != value.charAt(right)) return false;
        return isPalindrome(value, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        System.out.println(isPalindrome(value, 0, value.length() - 1) ? "Palindrome" : "Not Palindrome");
    }
}
