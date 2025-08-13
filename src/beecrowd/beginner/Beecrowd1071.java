package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1071 {

    /* https://judge.beecrowd.com/pt/problems/view/1071 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (y < x) {
            int aux = y;
            y = x;
            x = aux;
        }

        int sum = 0;
        for (int i = x + 1; i < y; i++) {
            if (i % 2 == 1 || i % 2 == -1) {
                sum += i;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}
