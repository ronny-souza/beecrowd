package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1044 {

    /* https://judge.beecrowd.com/pt/problems/view/1044 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        scanner.close();
    }
}
