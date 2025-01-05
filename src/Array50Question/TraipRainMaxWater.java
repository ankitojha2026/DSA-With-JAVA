package Array50Question;

import java.util.Arrays;

public class TraipRainMaxWater {
    public static void main(String[] args) {

        int arr[]={4,2,0,3,2,5};
        int n=arr.length;

        int []r=new int[n];
        int []l=new int[n];


        int maxr=arr[0];
        for(int i=0;i<n;i++)
        {
            if(maxr<arr[i])
            {
                maxr=arr[i];
                r[i]=maxr;
            }
            else
            {
                r[i]=maxr;
            }
        }


        int maxl=arr[n-1];
        for(int i=n-1;i>=0;i--)
        {
            if(maxl<arr[i])
            {
                maxl=arr[i];
                l[i]=maxl;
            }
            else
            {
                l[i]=maxl;
            }
        }

        int maxWater=0;
        for(int i=0;i<n;i++)
        {
            if(r[i]<l[i])
            {
                maxWater=maxWater+(r[i]-arr[i]);

            }
            else {
                maxWater=maxWater+(l[i]-arr[i]);
            }
        }

        System.out.println(maxWater);
    }
}

