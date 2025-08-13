package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1070 {

    /* https://judge.beecrowd.com/pt/problems/view/1070 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int x = scanner.nextInt();
        int counter = 0;
        for (int i = x; counter < 6; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                counter++;
            }
        }

        scanner.close();
    }
}
