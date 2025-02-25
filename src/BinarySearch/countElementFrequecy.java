package BinarySearch;

public class countElementFrequecy {

    public static int findLowerBound(int []arr, int x)
    {
        int low=0;
        int hi=arr.length;
        int lb=arr.length;
        while(low<=hi)
        {
            int mid=(low+hi)/2;
            if(arr[mid]>=x)
            {
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return lb;
    }


    public static int findUpperBound(int []arr, int x, int lb)
    {
        int up=0;
        while(true) {
            if (arr[lb] == x) {
                up = Math.max(up, lb);
                lb++;
            } else {
                return up;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,20,20,20,20,30,30,30,40,40};
        int fp=findLowerBound(arr,10);
        int lp=findUpperBound(arr,10,fp);
        int count=lp-fp+1;
        System.out.println(20+" Are comes In this array "+ count);
    }
}
