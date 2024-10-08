package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1041 {

	/* https://judge.beecrowd.com/pt/problems/view/1041 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();

		if (x == y && y == 0) {
			System.out.println("Origem");
		} else if (y == 0) {
			System.out.println("Eixo X");
		} else if (x == 0) {
			System.out.println("Eixo Y");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}

		scanner.close();
	}
}
