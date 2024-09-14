package beecrowd.beginner;

import java.util.Map;
import java.util.Scanner;

public class Beecrowd1038 {

	/* https://judge.beecrowd.com/pt/problems/view/1038 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<Integer, Double> items = Map.of(
				1, 4.00, 
				2, 4.50, 
				3, 5.00, 
				4, 2.00, 
				5, 1.50
		);

		String values = scanner.nextLine();
		String[] valuesAsArray = values.split(" ");

		Integer code = Integer.valueOf(valuesAsArray[0]);
		Integer quantity = Integer.valueOf(valuesAsArray[1]);

		Double itemUnitaryValue = items.get(code);
		double total = itemUnitaryValue * quantity;

		System.out.println(String.format("Total: R$ %.2f", total));
		scanner.close();
	}
}
