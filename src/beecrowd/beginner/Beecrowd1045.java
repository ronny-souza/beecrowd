package beecrowd.beginner;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1045 {

    /* https://judge.beecrowd.com/pt/problems/view/1045 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double[] lados = {a, b, c};
        Arrays.sort(lados);
        a = lados[2];
        b = lados[1];
        c = lados[0];

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            double firstCondition = a * a;
            double secondCondition = b * b + c * c;
            if (firstCondition == secondCondition) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (firstCondition > secondCondition) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (firstCondition < secondCondition) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }

            if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();
    }
}
