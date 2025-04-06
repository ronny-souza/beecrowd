package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1048 {

    /* https://judge.beecrowd.com/pt/problems/view/1048 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double currentRemuneration = scanner.nextDouble();
        int percent = 4;

        if (currentRemuneration >= 0 && currentRemuneration <= 400.00) {
            percent = 15;
        } else if (currentRemuneration >= 400.01 && currentRemuneration <= 800.00) {
            percent = 12;
        } else if (currentRemuneration >= 800.01 && currentRemuneration <= 1200.00) {
            percent = 10;
        } else if (currentRemuneration >= 1200.01 && currentRemuneration <= 2000.00) {
            percent = 7;
        }

        double adjustment = (currentRemuneration * percent) / 100;
        double newRemuneration = currentRemuneration + adjustment;
        System.out.printf("Novo salario: %.2f%n", newRemuneration);
        System.out.printf("Reajuste ganho: %.2f%n", adjustment);
        System.out.printf("Em percentual: %d %%%n", percent);
        scanner.close();
    }
}
