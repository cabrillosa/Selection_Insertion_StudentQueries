import java.util.*;

public class Selection {
    public static void main(String[] args) {
        int[] myArr = { 5, 4, 3, 2, 1 };

        for (int i = 0; i < myArr.length; i++) {
            int min = i;
            for (int j = i + 1; j < myArr.length; j++) {
                if (myArr[j] < myArr[min]) {
                    min = j;
                }
            }
            int temp = myArr[i];
            myArr[i] = myArr[min];
            myArr[min] = temp;
        }

        // for (int i = 0; i < myArr.length; i++) {
        //     System.out.println("myArr[" + i + "] = " + myArr[i]);
        // }
        System.out.println(myArr);
    }
}