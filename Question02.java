import java.util.Scanner;

public class Question02 {
    static void printNumbers(int n) {
        if (n < 1) return;
        System.out.print(n);
        if (n > 1) System.out.print(" ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printNumbers(scanner.nextInt());
    }
}
