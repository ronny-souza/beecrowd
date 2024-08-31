package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1012 {

	/* https://judge.beecrowd.com/pt/problems/view/1012 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final double PI = 3.14159;

		String valuesAsString = scanner.nextLine();
		String[] values = valuesAsString.split("\\s+");

		double a = Double.valueOf(values[0]);
		double b = Double.valueOf(values[1]);
		double c = Double.valueOf(values[2]);

//		Base multiplied by height, and divided by 2
		double triangle = (a * c) / 2;

//		PI multiplied by the radius to the power of two
		double circle = PI * (c * c);

//		Add the largest and smallest bases, then multiply by the height, and finally divide by 2
		double trapezium = ((a + b) * c) / 2;
		
//		Multiply one side of the square by itself
		double square = (b * b);
		
//		Multiply the length by the width
		double rectangle = (a * b);

		System.out.println(String.format("TRIANGULO: %.3f", triangle));
		System.out.println(String.format("CIRCULO: %.3f", circle));
		System.out.println(String.format("TRAPEZIO: %.3f", trapezium));
		System.out.println(String.format("QUADRADO: %.3f", square));
		System.out.println(String.format("RETANGULO: %.3f", rectangle));
		scanner.close();
	}
}
