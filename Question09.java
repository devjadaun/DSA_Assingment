import java.util.Scanner;

public class Question09 {
    static long reverse(long n, long result) {
        if (n == 0) return result;
        return reverse(n / 10, result * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reverse(scanner.nextLong(), 0));
    }
}
