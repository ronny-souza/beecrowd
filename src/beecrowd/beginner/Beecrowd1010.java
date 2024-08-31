package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1010 {

	/* https://judge.beecrowd.com/pt/problems/view/1010 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double value = 0.0;

		for (int i = 0; i < 2; i++) {
			String items = scanner.nextLine();
			String[] itemsAsArray = items.split("\\s+");

			int amount = Integer.valueOf(itemsAsArray[1]);
			double unitaryValue = Double.valueOf(itemsAsArray[2]);

			value += (amount * unitaryValue);
		}

		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", value));
		scanner.close();
	}
}
