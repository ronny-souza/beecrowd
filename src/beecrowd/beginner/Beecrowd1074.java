package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1074 {

    /* https://judge.beecrowd.com/pt/problems/view/1074 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            int x = scanner.nextInt();

            if (x == 0) {
                System.out.println("NULL");
            } else {
                if (x % 2 == 0) {
                    builder.append("EVEN ");
                } else {
                    builder.append("ODD ");
                }

                if (x > 0) {
                    builder.append("POSITIVE");
                } else {
                    builder.append("NEGATIVE");
                }

                System.out.println(builder);
            }
        }

        scanner.close();
    }
}
