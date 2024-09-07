package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1017 {

	/* https://judge.beecrowd.com/pt/problems/view/1017 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int hours = scanner.nextInt();
		int speed = scanner.nextInt();

		int distance = speed * hours;
		double result = distance / 12.0;
		System.out.println(String.format("%.3f", result));
		scanner.close();
	}
}
