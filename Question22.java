import java.util.Scanner;

public class Question22 {
    static boolean isSorted(int[] values, int index) {
        if (index >= values.length - 1) return true;
        if (values[index] > values[index + 1]) return false;
        return isSorted(values, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = scanner.nextInt();
        System.out.println(isSorted(values, 0) ? "Sorted" : "Not Sorted");
    }
}
