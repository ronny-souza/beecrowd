package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1072 {

    /* https://judge.beecrowd.com/pt/problems/view/1072 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int n = scanner.nextInt();
        int quantityIn = 0;
        int quantityOut = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x >= 10 && x <= 20) {
                quantityIn++;
            } else {
                quantityOut++;
            }
        }

        System.out.printf("%d in%n", quantityIn);
        System.out.printf("%d out%n", quantityOut);
        scanner.close();
    }
}
