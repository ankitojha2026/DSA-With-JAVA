package preFixSum;
import java.util.*;
public class EquilibriumIndexOfAnArray {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        int[] sufix = new int[arr.length];
        sufix[arr.length - 1] = arr[arr.length - 1];
        //prefix sum of the given array;

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }


        //sufix sum of the given array;
        for (int i = arr.length - 2; i >= 0; i--) {
            sufix[i] = sufix[i + 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (prefix[i] == sufix[i]) {
                System.out.println("index : " + i);
                return;

            }
        }
        System.out.println(-1);
    }
}

