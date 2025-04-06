package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1047 {

    /* https://judge.beecrowd.com/pt/problems/view/1047 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int startHours = scanner.nextInt();
        int startMinutes = scanner.nextInt();
        int endHours = scanner.nextInt();
        int endMinutes = scanner.nextInt();

        int startTimeInMinutes = (startHours * 60) + startMinutes;
        int endTimeInMinutes = (endHours * 60) + endMinutes;
        int oneDayInMinutes = (24 * 60);
        int finalHours = 0;
        int finalMinutes = 0;

        if (endTimeInMinutes > startTimeInMinutes) {
            finalHours = (endTimeInMinutes - startTimeInMinutes);
            finalMinutes = (finalHours % 60);
            finalHours = finalHours / 60;
        } else if (startTimeInMinutes > endTimeInMinutes) {
            finalHours = ((oneDayInMinutes - startTimeInMinutes) + (endTimeInMinutes));
            finalMinutes = (finalHours % 60);
            finalHours = finalHours / 60;
        } else {
            finalHours = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", finalHours, finalMinutes);

        scanner.close();
    }
}
