import java.util.Scanner;

public class Question26 {
    static int searchFirst(int[] values, int target, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (values[mid] >= target) {
            int earlier = searchFirst(values, target, low, mid - 1);
            if (earlier != -1) return earlier;
            return values[mid] == target ? mid : -1;
        }
        return searchFirst(values, target, mid + 1, high);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = scanner.nextInt();
        System.out.println(searchFirst(values, target, 0, n - 1));
    }
}
