package beecrowd.beginner;


public class Beecrowd1095 {

    /* https://judge.beecrowd.com/pt/problems/view/1095 */

    public static void main(String[] args) {
        int i = 1;
        int j = 60;
        while (j > 0) {
            System.out.printf("I=%d J=%d%n", i, j);
            i += 3;
            j -= 5;
        }
        System.out.printf("I=%d J=%d%n", i, j);
    }
}
