package beecrowd.beginner;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1064 {

    /* https://judge.beecrowd.com/pt/problems/view/1064 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        List<Double> positives = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            double value = scanner.nextDouble();
            if (value >= 0) {
                positives.add(value);
            }
        }

        System.out.printf("%d valores positivos%n", positives.size());

        double average = positives.stream().mapToDouble(Double::doubleValue).sum() / positives.size();
        System.out.printf("%.1f%n", average);
        scanner.close();
    }
}
