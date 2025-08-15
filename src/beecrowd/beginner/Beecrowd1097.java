package beecrowd.beginner;


public class Beecrowd1097 {

    /* https://judge.beecrowd.com/pt/problems/view/1097 */

    public static void main(String[] args) {
        int i = 1;
        for (int block = 0; block < 5; block++) {
            int j = 7 + block * 2;
            for (int line = 0; line < 3; line++) {
                System.out.printf("I=%d J=%d%n", i, j);
                j--;
            }
            i += 2;
        }
    }
}
