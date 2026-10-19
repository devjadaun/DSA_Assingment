import java.util.Scanner;

public class Question20 {
    static String remove(String value, char target, int index) {
        if (index == value.length()) return "";
        String rest = remove(value, target, index + 1);
        if (value.charAt(index) == target) return rest;
        return value.charAt(index) + rest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        char target = scanner.nextLine().charAt(0);
        System.out.println(remove(value, target, 0));
    }
}
