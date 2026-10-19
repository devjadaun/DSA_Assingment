import java.util.Scanner;

public class Question05 {
    static long sum(int n) {
        if (n <= 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sum(scanner.nextInt()));
    }
}
