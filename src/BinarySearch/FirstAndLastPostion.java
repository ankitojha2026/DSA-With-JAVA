package BinarySearch;

//Find first and last position of element in sorted Array.
public class FirstAndLastPostion {

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
        int lb=findLowerBound(arr,20);
        System.out.println(lb);
        System.out.println(findUpperBound(arr,20 ,findLowerBound(arr,20)));
    }
}
