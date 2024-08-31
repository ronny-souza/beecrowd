package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1013 {

	/* https://judge.beecrowd.com/pt/problems/view/1013 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int larger = (a + b + Math.abs(a - b)) / 2;

		if (larger > c) {
			System.out.println(String.format("%d eh o maior", larger));
		} else {
			System.out.println(String.format("%d eh o maior", c));
		}

		scanner.close();
	}
}
