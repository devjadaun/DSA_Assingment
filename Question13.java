import java.util.Scanner;

public class Question13 {
    static long power(long a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        int b = scanner.nextInt();
        System.out.println(power(a, b));
    }
}
