import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] myArr = { 13, 1, 5, 7, 6, 9, 10 };

        for (int i = 1; i < myArr.length; i++) {
            int boundery = i;
            int value_to_insert = myArr[i];
            while (boundery > 0 && value_to_insert < myArr[boundery - 1]) {
                myArr[boundery] = myArr[boundery - 1];
                boundery--;
            }
            myArr[boundery] = value_to_insert;
        }

        System.out.println(Arrays.toString(myArr));
    }
}
