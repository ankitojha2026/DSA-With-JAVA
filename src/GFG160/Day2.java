package GFG160;

import java.util.Arrays;

// move Zero in the right side without using extra space in the arr
public class Day2 {

    public static void moveZero(int []arr)
    {
        int j=0;
        int count=0;
        for(int i=0;i<arr.length ;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }

        System.out.println(arr.length-count);


        for(int i=0;i<arr.length ;i++)
        {
            if(arr[i]!=0) {
                arr[j] = arr[i];
                j++;
            }
        }

        for(int i=(arr.length-count) ;i<arr.length ;i++)
        {
            arr[i]=0;
        }





    }
    public static void main(String[] args) {

        int []arr={1,0,3,4,0,7,0,5};
        System.out.println(Arrays.toString(arr));
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
