import java.util.Scanner;

public class Question24 {
    static int minimum(int[] values, int index) {
        if (index == values.length - 1) return values[index];
        return Math.min(values[index], minimum(values, index + 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = scanner.nextInt();
        System.out.println(minimum(values, 0));
    }
}
