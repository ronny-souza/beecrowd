package beecrowd.beginner;


import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1060 {

    /* https://judge.beecrowd.com/pt/problems/view/1060 */

    public static void main(String[] args) {
        int quantityOfPositives = 0;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        for (int i = 0; i < 6; i++) {
            double value = scanner.nextDouble();
            if (value >= 0) {
                quantityOfPositives++;
            }
        }

        System.out.printf("%d valores positivos%n", quantityOfPositives);
        scanner.close();
    }
}
