package Array50Question;

import java.util.*;
public class FindPeakElement {
    public static void main(String[] args) {
        int []arr={16,4,5,6,1,12,16};

        if(arr.length<=3)
        {
            System.out.println("invilid error ");
        }
        else {
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
