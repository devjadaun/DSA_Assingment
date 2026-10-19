import java.util.Scanner;

public class Question12 {
    static int countDigits(long n) {
        if (n < 10) return 1;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countDigits(scanner.nextLong()));
    }
}
