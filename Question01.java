import java.util.Scanner;

public class Question01 {
    static void printNumbers(int n, int current) {
        if (current > n) return;
        System.out.print(current);
        if (current < n) System.out.print(" ");
        printNumbers(n, current + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 1) printNumbers(n, 1);
    }
}
