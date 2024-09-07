package beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1021 {

	/* https://judge.beecrowd.com/pt/problems/view/1021 */

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		keyboard.useLocale(Locale.ENGLISH);

		double banknotes[] = { 100.0, 50.0, 20.0, 10.0, 5.0, 2.0 };
		double coins[] = { 1.0, 0.50, 0.25, 0.10, 0.05, 0.01 };
		double value = keyboard.nextDouble();
		int quantityOfBanknotes = 0;
		int quantityOfCoins = 0;

//		Converting to cents with adjusts
		value = (value * 100) + 0.05;

		System.out.println("NOTAS:");
		for (int i = 0; i < banknotes.length; i++) {
			quantityOfBanknotes = (int) (value / (banknotes[i] * 100));
			value %= banknotes[i] * 100;
			System.out.println(String.format("%d nota(s) de R$ %.2f", quantityOfBanknotes, banknotes[i]));
		}

		System.out.println("MOEDAS:");
		for (int i = 0; i < coins.length; i++) {
			quantityOfCoins = (int) (value / (coins[i] * 100));
			value %= coins[i] * 100;
			System.out.println(String.format("%d moeda(s) de R$ %.2f", quantityOfCoins, coins[i]));
		}

		keyboard.close();
	}
}
