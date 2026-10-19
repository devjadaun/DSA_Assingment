import java.util.Scanner;

public class Question10 {
    static int sumDigits(long n) {
        if (n < 10) return (int) n;
        return (int) (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumDigits(scanner.nextLong()));
    }
}
