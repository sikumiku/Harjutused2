import java.util.Arrays;

/**
 * Prindi konsooli 27x27 maatriks, kus on täidetud eesti tähestiku sudoku.
 * https://et.wikipedia.org/wiki/Eesti_t%C3%A4hestik
 */
public class Maatriks {

    public static void main (String[] args) {
        char[][] result = sudoku();
        System.out.println(result.toString());

    }

    public static char[][] sudoku() {

        char[][] result = new char[26][26];

        char[] t2hestik = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'Š', 'Z', 'Ž', 'T', 'U', 'V', 'Õ', 'Ä', 'Ö', 'Ü'};

        int rows = 26;
        int columns = 26;
        int n = 0;
        int i, j;

        for (i = 0; i < rows; i++) {
            t2hestik[n] = (char) (Math.random()*26);
            result[i][j] = t2hestik[n];
            for (j = 0; j < columns; j++) {
                if (result[i] == result[j]) {
                    t2hestik[n] = (char) (Math.random()*26);
                    result[i][j] = t2hestik[n];
                }
            }
        }

        return result;

    }
}
