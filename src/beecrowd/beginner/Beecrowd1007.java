package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1007 {

	/* https://judge.beecrowd.com/pt/problems/view/1007 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		int diff = a * b - c * d;
		System.out.println(String.format("DIFERENCA = %d", diff));
		scanner.close();
	}
}
