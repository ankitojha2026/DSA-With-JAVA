package Array50Question;

import java.util.*;
public class MoveNegativeNumberOneSide {
    public static void main(String[] args) {

        int []arr={1,2,3,4,5,6,-1,2,-3,6,-3};
        int j=0;
        int k=arr.length-1;
        for (int i=0;i<arr.length/2;i++)
        {
            if(arr[j]>=0 && arr[k]<0 )
            {
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                j++;
                k--;
            }
            else
            {
                if(arr[j]<0)
                {
                    j++;
                }
                if(arr[k]>=0)
                {
                    k--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
