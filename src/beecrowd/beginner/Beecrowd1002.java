package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1002 {

	/* https://judge.beecrowd.com/pt/problems/view/1002 */

	public static void main(String[] args) {
		final double n = 3.14159;
		Scanner scanner = new Scanner(System.in);

		double radius = scanner.nextDouble();
		double area = n * (radius * radius);
		
		System.out.println(String.format("A=%.4f", area));
		scanner.close();
	}
}
