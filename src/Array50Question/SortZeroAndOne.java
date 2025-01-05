package Array50Question;

import java.util.Arrays;
public class SortZeroAndOne {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,0,1,0,0,1,0};

        int i=0;
        int j=arr.length-1;
        while(i<j)
        {

            if(arr[i]!=0 && arr[i]!=1)
            {
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
            }
            else
            {
                if(arr[i]==0)
                {
                    i++;
                }
                if(arr[j]==1)
                {
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
