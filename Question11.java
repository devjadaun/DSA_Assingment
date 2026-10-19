import java.util.Scanner;

public class Question11 {
    static long productDigits(long n) {
        if (n < 10) return n;
        return n % 10 * productDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(productDigits(scanner.nextLong()));
    }
}
