import java.util.Scanner;

public class Question17 {
    static void toBinary(long n) {
        if (n > 1) toBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        toBinary(scanner.nextLong());
    }
}
