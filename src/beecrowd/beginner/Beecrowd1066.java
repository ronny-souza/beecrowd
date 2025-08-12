package beecrowd.beginner;


import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1066 {

    /* https://judge.beecrowd.com/pt/problems/view/1066 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int quantityOfPairs = 0;
        int quantityOfOdds = 0;
        int quantityOfPositives = 0;
        int quantityOfNegatives = 0;
        for (int i = 0; i < 5; i++) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                quantityOfPairs++;
            } else {
                quantityOfOdds++;
            }

            if (value > 0) {
                quantityOfPositives++;
            } else if (value != 0) {
                quantityOfNegatives++;
            }
        }

        System.out.printf("%d valor(es) par(es)%n", quantityOfPairs);
        System.out.printf("%d valor(es) impar(es)%n", quantityOfOdds);
        System.out.printf("%d valor(es) positivo(s)%n", quantityOfPositives);
        System.out.printf("%d valor(es) negativo(s)%n", quantityOfNegatives);
        scanner.close();
    }
}
