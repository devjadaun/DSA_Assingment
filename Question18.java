import java.util.Scanner;

public class Question18 {
    static long toDecimal(String binary, int index) {
        if (index == binary.length()) return 0;
        return (binary.charAt(index) - '0') * powerOfTwo(binary.length() - index - 1) + toDecimal(binary, index + 1);
    }

    static long powerOfTwo(int exponent) {
        if (exponent == 0) return 1;
        return 2 * powerOfTwo(exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(toDecimal(scanner.nextLine(), 0));
    }
}
