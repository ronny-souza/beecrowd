package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1043 {

    /* https://judge.beecrowd.com/pt/problems/view/1043 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        boolean isTriangle = ((a < (b + c)) && (b < (a + c)) && (c < (a + b)));

        if (isTriangle) {
            double perimeter = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimeter);
        } else {
            double area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", area);
        }

        scanner.close();
    }
}
