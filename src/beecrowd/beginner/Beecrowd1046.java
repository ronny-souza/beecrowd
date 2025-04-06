package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1046 {

    /* https://judge.beecrowd.com/pt/problems/view/1046 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int startTime = scanner.nextInt();
        int endTime = scanner.nextInt();
        int totalTime = 0;
        if (startTime == endTime) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            if (startTime > endTime) {
                totalTime = (24 - startTime) + endTime;
            } else {
                totalTime = endTime - startTime;
            }

            System.out.printf("O JOGO DUROU %d HORA(S)%n", totalTime);
        }

        scanner.close();
    }
}
