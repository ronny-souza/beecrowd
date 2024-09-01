package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1016 {

	/* https://judge.beecrowd.com/pt/problems/view/1016 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int distance = scanner.nextInt();
		int time = distance * 2;
		System.out.println(String.format("%d minutos", time));
		scanner.close();
	}
}
