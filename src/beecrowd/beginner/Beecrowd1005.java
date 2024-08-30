package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1005 {

	/* https://judge.beecrowd.com/pt/problems/view/1005 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double weightA = 3.5;
		double weightB = 7.5;
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		double average = ((a * weightA) + (b * weightB)) / (weightA + weightB);
		System.out.println(String.format("MEDIA = %.5f", average));
		scanner.close();
	}
}
