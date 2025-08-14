package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1078 {

    /* https://judge.beecrowd.com/pt/problems/view/1078 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = i * n;
            System.out.printf("%d x %d = %d%n", i, n, result);
        }

        scanner.close();
    }
}
