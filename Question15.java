import java.util.Scanner;

public class Question15 {
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(gcd(scanner.nextLong(), scanner.nextLong()));
    }
}
