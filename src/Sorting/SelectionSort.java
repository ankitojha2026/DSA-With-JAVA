package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSoring(int []arr , int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,1,3,8,9,2,4};
      selectionSoring(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
