import java.util.Scanner;

public class Question23 {
    static int maximum(int[] values, int index) {
        if (index == values.length - 1) return values[index];
        return Math.max(values[index], maximum(values, index + 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = scanner.nextInt();
        System.out.println(maximum(values, 0));
    }
}
