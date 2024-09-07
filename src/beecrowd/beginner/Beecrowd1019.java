package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1019 {

	/* https://judge.beecrowd.com/pt/problems/view/1019 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int durationInSeconds = scanner.nextInt();

		int seconds = durationInSeconds % 60;
		int minutes = durationInSeconds / 60;
		int hours = minutes / 60;
		minutes = minutes % 60;

		System.out.println(String.format("%d:%d:%d", hours, minutes, seconds));
		scanner.close();
	}
}
