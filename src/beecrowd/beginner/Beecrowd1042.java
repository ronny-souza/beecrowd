package beecrowd.beginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1042 {

    /* https://judge.beecrowd.com/pt/problems/view/1042 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            values.add(scanner.nextInt());
        }

        List<Integer> valuesInOriginalOrder = new ArrayList<>(values);
        Collections.sort(values);
        values.forEach(System.out::println);
        System.out.println();
        valuesInOriginalOrder.forEach(System.out::println);
        scanner.close();
    }
}
