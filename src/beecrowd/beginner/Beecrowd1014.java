package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1014 {

	/* https://judge.beecrowd.com/pt/problems/view/1014 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		float y = scanner.nextFloat();
		
		float result = x / y;
		
		System.out.println(String.format("%.3f km/l", result));
		scanner.close();
	}
}
