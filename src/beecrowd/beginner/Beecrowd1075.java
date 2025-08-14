package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1075 {

    /* https://judge.beecrowd.com/pt/problems/view/1075 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int n = scanner.nextInt();

        for(int i = 1; i < 10000; i++) {
            if (i % n == 2) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
