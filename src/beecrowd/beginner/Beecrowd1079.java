package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1079 {

    /* https://judge.beecrowd.com/pt/problems/view/1079 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            double valueA = scanner.nextDouble();
            double valueB = scanner.nextDouble();
            double valueC = scanner.nextDouble();

            double result = ((valueA * 2) + (valueB * 3) + (valueC * 5)) / 10;
            System.out.printf("%.1f%n", result);
        }

        scanner.close();
    }
}
