package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1011 {

	/* https://judge.beecrowd.com/pt/problems/view/1011 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.14159;

		double r = scanner.nextDouble();
		double result = (4.0 / 3) * PI * (Math.pow(r, 3));

		System.out.println(String.format("VOLUME = %.3f", result));
		scanner.close();
	}
}
