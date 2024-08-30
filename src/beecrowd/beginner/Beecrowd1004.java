package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1004 {

	/* https://judge.beecrowd.com/pt/problems/view/1004 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int prod = a * b;
		System.out.println(String.format("PROD = %d", prod));
		scanner.close();
	}
}
