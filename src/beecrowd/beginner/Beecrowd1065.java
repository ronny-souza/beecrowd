package beecrowd.beginner;


import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1065 {

    /* https://judge.beecrowd.com/pt/problems/view/1065 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int quantityOfPairs = 0;
        for (int i = 0; i < 5; i++) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                quantityOfPairs++;
            }
        }

        System.out.printf("%d valores pares%n", quantityOfPairs);
        scanner.close();
    }
}
