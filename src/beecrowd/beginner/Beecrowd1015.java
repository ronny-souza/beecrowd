package beecrowd.beginner;

import java.util.Scanner;

public class Beecrowd1015 {

	/* https://judge.beecrowd.com/pt/problems/view/1015 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String p1AsString = scanner.nextLine();
		String p2AsString = scanner.nextLine();

		String[] p1AsArray = p1AsString.split("\\s+");
		String[] p2AsArray = p2AsString.split("\\s+");

		double x1 = Double.valueOf(p1AsArray[0]);
		double y1 = Double.valueOf(p1AsArray[1]);
		double x2 = Double.valueOf(p2AsArray[0]);
		double y2 = Double.valueOf(p2AsArray[1]);

		double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		System.out.println(String.format("%.4f", distance));
		scanner.close();
	}
}
