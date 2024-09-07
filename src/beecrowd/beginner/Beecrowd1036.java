package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1036 {

	/* https://judge.beecrowd.com/pt/problems/view/1036 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		double delta = (b * b) - 4 * a * c;

		if (delta >= 0 && (2 * a) > 0) {			
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println(String.format("R1 = %.5f", x1));
			System.out.println(String.format("R2 = %.5f", x2));
		} else {
			System.out.println("Impossivel calcular");
		}
		
		scanner.close();
	}
}
