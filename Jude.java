import java.util.Arrays;

public class Jude {
    public static void main(String[] args) {
        int[][] jude = new int[5][5];
        for (int i = 0; i < jude.length; i++) {
            for (int j = 0; j < jude.length; j++) {
                jude[i][j] = i * j;
            }
        }
        for (int i = 0; i < 5; i++)
            System.out.println("BEfore: " + Arrays.toString(jude[i]));

        // instantiate
        Jude j = new Jude();
        j.erase2D(jude);
        // erase
        for (int i = 0; i < 5; i++)
            System.out.println("After: " + Arrays.toString(jude[i]));

        j.markLast(jude);

        for (int i = 0; i < 5; i++)
            System.out.println("After marking last: " + Arrays.toString(jude[i]));
    }

    public int[][] erase2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = -1;
            }
        }
        return arr;
    }

    public int[] markLast(int[][] arr) {
        int len = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            arr[len - 1][i] = 100;
        }

        return arr[len - 1];
    }
}
