package beecrowd.beginner;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Beecrowd1049 {

    /* https://judge.beecrowd.com/pt/problems/view/1049 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String type = scanner.nextLine();
        String classification = scanner.nextLine();
        String diet = scanner.nextLine();

        Map<String, String> animals = Map.of(
                "vertebrado ave carnivoro", "aguia",
                "vertebrado ave onivoro", "pomba",
                "vertebrado mamifero onivoro", "homem",
                "vertebrado mamifero herbivoro", "vaca",
                "invertebrado inseto hematofago", "pulga",
                "invertebrado inseto herbivoro", "lagarta",
                "invertebrado anelideo hematofago", "sanguessuga",
                "invertebrado anelideo onivoro", "minhoca"
        );

        String key = String.format("%s %s %s", type, classification, diet);
        System.out.println(animals.get(key));
        scanner.close();
    }
}
