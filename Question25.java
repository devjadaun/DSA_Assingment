import java.util.Scanner;

public class Question25 {
    static int search(int[] values, int target, int index) {
        if (index == values.length) return -1;
        if (values[index] == target) return index;
        return search(values, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = scanner.nextInt();
        System.out.println(search(values, target, 0));
    }
}
