package beecrowd.beginner;

public class Beecrowd1098 {

    /* https://judge.beecrowd.com/pt/problems/view/1097 */

    public static void main(String[] args) {
        double i = 0;
        for (int block = 0; block < 11; block++) {
            double j = 1 + i;
            for (int line = 0; line < 3; line++) {
                double iPrint = Math.round(i * 10.0) / 10.0;
                double jPrint = Math.round(j * 10.0) / 10.0;

                if (iPrint % 1 == 0 && jPrint % 1 == 0) {
                    System.out.printf("I=%.0f J=%.0f%n", iPrint, jPrint);
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", iPrint, jPrint);
                }
                j++;
            }
            i += 0.2;
        }
    }
}
