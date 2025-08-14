package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1080 {

    /* https://judge.beecrowd.com/pt/problems/view/1080 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int bigger = 0;
        int position = 1;
        for (int i = 1; i <= 100; i++) {
            int n = scanner.nextInt();

            if (n > bigger) {
                bigger = n;
                position = i;
            }
        }

        System.out.println(bigger);
        System.out.println(position);

        scanner.close();
    }
}
