package beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Beecrowd1040 {

	/* https://judge.beecrowd.com/pt/problems/view/1040 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String grades = scanner.nextLine();
		String[] gradesAsArray = grades.split(" ");

		DecimalFormat decimalFormat = new DecimalFormat("0.0");
		double N1 = Double.valueOf(gradesAsArray[0]);
		double N2 = Double.valueOf(gradesAsArray[1]);
		double N3 = Double.valueOf(gradesAsArray[2]);
		double N4 = Double.valueOf(gradesAsArray[3]);

		double average = ((N1 * 2.0) + (N2 * 3.0) + (N3 * 4.0) + (N4 * 1.0)) / 10.0;

		System.out.println(String.format("Media: %s", decimalFormat.format(average)));

		if (average >= 7.0) {
			System.out.println("Aluno aprovado.");
		}

		if (average < 5.0) {
			System.out.println("Aluno reprovado.");
		}

		if (average >= 5.0 && average <= 6.9) {
			System.out.println("Aluno em exame.");
			double recoveryNote = scanner.nextDouble();
			System.out.println(String.format("Nota do exame: %s", decimalFormat.format(recoveryNote)));

			double newAverage = (average + recoveryNote) / 2;
			if (newAverage >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.println(String.format("Media final: %s", decimalFormat.format(newAverage)));
			} else {
				System.out.println("Aluno reprovado.");
				System.out.println(String.format("Media final: %s", decimalFormat.format(newAverage)));
			}
		}
		scanner.close();
	}
}
