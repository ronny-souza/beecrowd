package beecrowd.beginner;


public class Beecrowd1096 {

    /* https://judge.beecrowd.com/pt/problems/view/1096 */

    public static void main(String[] args) {
        int i = 1;
        int j = 7;
        int count = 1;
        int interactions = 1;
        while (interactions != 6) {
            System.out.printf("I=%d J=%d%n", i, j);

            if (j == 5) {
                j = 7;
            } else {
                j--;
            }

            if (count == 3) {
                count = 1;
                i+=2;
                interactions++;
            } else {
                count++;
            }
        }
    }
}
