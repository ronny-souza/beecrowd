package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1008 {

	/* https://judge.beecrowd.com/pt/problems/view/1008 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int hoursWorked = scanner.nextInt();
		double hourlyRate = scanner.nextDouble();
		
		double salary = hourlyRate * hoursWorked;
		System.out.println(String.format("NUMBER = %d", number));
		System.out.println(String.format("SALARY = U$ %.2f", salary));
		scanner.close();
	}
}
