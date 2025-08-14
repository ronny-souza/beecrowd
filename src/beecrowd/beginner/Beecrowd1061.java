package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1061 {

    /* https://judge.beecrowd.com/pt/problems/view/1061 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String startDayAsString = scanner.nextLine();
        int startDay = Integer.parseInt(startDayAsString.split(" ")[1]);

        String startHoursAsString = scanner.nextLine();
        String[] startHoursAsStringArray = startHoursAsString.split(" : ");

        int startHour = Integer.parseInt(startHoursAsStringArray[0]);
        int startMinutes = Integer.parseInt(startHoursAsStringArray[1]);
        int startSeconds = Integer.parseInt(startHoursAsStringArray[2]);

        String endDayAsString = scanner.nextLine();
        int endDay = Integer.parseInt(endDayAsString.split(" ")[1]);

        String endHoursAsString = scanner.nextLine();
        String[] endHoursAsStringArray = endHoursAsString.split(" : ");

        int endHour = Integer.parseInt(endHoursAsStringArray[0]);
        int endMinutes = Integer.parseInt(endHoursAsStringArray[1]);
        int endSeconds = Integer.parseInt(endHoursAsStringArray[2]);

        int startInSeconds = startSeconds + startMinutes * 60 + startHour * 3600 + startDay * 86400;
        int endInSeconds = endSeconds + endMinutes * 60 + endHour * 3600 + endDay * 86400;

        int duration = (endInSeconds - startInSeconds);

        int durationInDays = duration / 86400;
        duration %= 86400;

        int durationInHours = duration / 3600;
        duration %= 3600;

        int durationInMinutes = duration / 60;
        duration %= 60;

        int durationInSeconds = duration % 60;

        System.out.printf("%d dia(s)%n", durationInDays);
        System.out.printf("%d hora(s)%n", durationInHours);
        System.out.printf("%d minuto(s)%n", durationInMinutes);
        System.out.printf("%d segundo(s)%n", durationInSeconds);
        scanner.close();
    }
}
