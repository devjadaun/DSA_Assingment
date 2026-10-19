import java.util.Scanner;

public class Question21 {
    static String replace(String value, char oldChar, char newChar, int index) {
        if (index == value.length()) return "";
        char current = value.charAt(index) == oldChar ? newChar : value.charAt(index);
        return current + replace(value, oldChar, newChar, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String chars = scanner.nextLine();
        System.out.println(replace(value, chars.charAt(0), chars.charAt(2), 0));
    }
}
