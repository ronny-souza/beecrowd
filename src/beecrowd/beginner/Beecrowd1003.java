package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1003 {

	/* https://judge.beecrowd.com/pt/problems/view/1003 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int sum = a + b;
		System.out.println(String.format("SOMA = %d", sum));
		scanner.close();
	}
}
