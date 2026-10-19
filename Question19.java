import java.util.Scanner;

public class Question19 {
    static int count(String value, char target, int index) {
        if (index == value.length()) return 0;
        int found = value.charAt(index) == target ? 1 : 0;
        return found + count(value, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        char target = scanner.nextLine().charAt(0);
        System.out.println(count(value, target, 0));
    }
}
