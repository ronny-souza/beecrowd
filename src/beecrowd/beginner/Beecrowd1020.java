package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1020 {

	/* https://judge.beecrowd.com/pt/problems/view/1019 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int ageInDays = scanner.nextInt();

		int years = ageInDays / 365;
		int months = (ageInDays % 365) / 30;
		int days = ((ageInDays % 365) % 30);

		System.out.println(String.format("%d ano(s)", years));
		System.out.println(String.format("%d mes(es)", months));
		System.out.println(String.format("%d dia(s)", days));
		scanner.close();
	}
}
