package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1009 {

	/* https://judge.beecrowd.com/pt/problems/view/1009 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int commissionPercent = 15;
		
		String name = scanner.nextLine();
		double salary = scanner.nextDouble();
		double salesInMonth = scanner.nextDouble();
		
		double commission = (salesInMonth * commissionPercent) / 100;
		salary += commission;
		
		System.out.println(String.format("TOTAL = R$ %.2f", salary));
		scanner.close();
	}
}
