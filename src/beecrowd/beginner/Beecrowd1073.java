package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1073 {

    /* https://judge.beecrowd.com/pt/problems/view/1073 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                double square = Math.pow(i, 2);
                System.out.printf("%d^%d = %.0f%n", i, 2, square);
            }
        }
        scanner.close();
    }
}
