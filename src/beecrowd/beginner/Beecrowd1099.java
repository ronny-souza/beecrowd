package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1099 {

    /* https://judge.beecrowd.com/pt/problems/view/1099 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int aux = x;
            if (x > y) {
                x = y;
                y = aux;
            }

            int total = 0;
            for (int j = x; j < y; j++) {
                if (j % 2 == 1 && j != x) {
                    total += j;
                }
            }
            System.out.println(total);
        }
        scanner.close();
    }
}
