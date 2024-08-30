package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1006 {

	/* https://judge.beecrowd.com/pt/problems/view/1006 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double weightA = 2;
		double weightB = 3;
		double weightC = 5;
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double average = ((a * weightA) + (b * weightB) + (c * weightC)) / (weightA + weightB + weightC);
		System.out.println(String.format("MEDIA = %.1f", average));
		scanner.close();
	}
}
