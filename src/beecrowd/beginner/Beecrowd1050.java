package beecrowd.beginner;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Beecrowd1050 {

    /* https://judge.beecrowd.com/pt/problems/view/1050 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int ddd = scanner.nextInt();

        Map<Integer, String> animals = Map.of(
                61, "Brasilia",
                71, "Salvador",
                11, "Sao Paulo",
                21, "Rio de Janeiro",
                32, "Juiz de Fora",
                19, "Campinas",
                27, "Vitoria",
                31, "Belo Horizonte"
        );

        System.out.println(animals.getOrDefault(ddd, "DDD nao cadastrado"));
        scanner.close();
    }
}
