import java.util.Scanner;

public class Question04 {
    static void printOdd(int current, int n) {
        if (current > n) return;
        System.out.print(current);
        if (current + 2 <= n) System.out.print(" ");
        printOdd(current + 2, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 1) printOdd(1, n);
    }
}
