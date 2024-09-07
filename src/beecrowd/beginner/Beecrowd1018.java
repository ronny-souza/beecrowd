package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1018 {

	/* https://judge.beecrowd.com/pt/problems/view/1018 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int value = scanner.nextInt();
		int originalValue = value;
		int[] banknotes = { 100, 50, 20, 10, 5, 2, 1 };
		int[] quantityOfBanknotes = new int[banknotes.length];

		for (int i = 0; i < banknotes.length; i++) {
			quantityOfBanknotes[i] = value / banknotes[i];
			value %= banknotes[i];
		}

		System.out.println(originalValue);
		for (int i = 0; i < banknotes.length; i++) {
			System.out.println(String.format("%d nota(s) de R$ %d,00", quantityOfBanknotes[i], banknotes[i]));
		}
		scanner.close();
	}
}
