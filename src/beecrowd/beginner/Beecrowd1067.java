package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1067 {

    /* https://judge.beecrowd.com/pt/problems/view/1067 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
