package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1001 {
	
	/* https://judge.beecrowd.com/pt/problems/view/1001 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		int b = scanner.nextInt();
		
		int x = a + b;
		System.out.println(String.format("X = %d", x));
		scanner.close();
	}
}
