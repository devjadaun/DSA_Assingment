import java.util.Scanner;

public class Question07 {
    static void reverse(String value, int index) {
        if (index < 0) return;
        System.out.print(value.charAt(index));
        reverse(value, index - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        reverse(value, value.length() - 1);
    }
}
