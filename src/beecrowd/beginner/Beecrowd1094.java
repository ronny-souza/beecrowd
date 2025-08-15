package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1094 {

    /* https://judge.beecrowd.com/pt/problems/view/1094 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int n = scanner.nextInt();
        int totalOfRabbits = 0;
        int totalOfFrogs = 0;
        int totalOfRats = 0;

        for (int i = 0; i < n; i++) {
            int amount = scanner.nextInt();
            String type = scanner.next();

            if (type.equalsIgnoreCase("C")) {
                totalOfRabbits += amount;
            } else if (type.equalsIgnoreCase("S")) {
                totalOfFrogs += amount;
            } else if (type.equalsIgnoreCase("R")) {
                totalOfRats += amount;
            }
        }

        int total = totalOfRabbits + totalOfFrogs + totalOfRats;
        double rabbitsPercent = ((double) totalOfRabbits / total) * 100;
        double frogsPercent = ((double) totalOfFrogs / total) * 100;
        double ratsPercent = ((double) totalOfRats / total) * 100;

        System.out.printf("Total: %d cobaias%n", total);
        System.out.printf("Total de coelhos: %d%n", totalOfRabbits);
        System.out.printf("Total de ratos: %d%n", totalOfRats);
        System.out.printf("Total de sapos: %d%n", totalOfFrogs);
        System.out.printf("Percentual de coelhos: %.2f %%%n", rabbitsPercent);
        System.out.printf("Percentual de ratos: %.2f %%%n", ratsPercent);
        System.out.printf("Percentual de sapos: %.2f %%%n", frogsPercent);
        scanner.close();
    }
}
