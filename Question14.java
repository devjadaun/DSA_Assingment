import java.util.Scanner;

public class Question14 {
    static long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(fibonacci(i));
        }
    }
}
