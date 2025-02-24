package BinarySearch;

// Given a sorted integer array and am integer 'x' , find
// the lower bound of X.
public class LowerBound {

    public static int lowerBound(int []arr, int k)
    {
        int low=0;
        int hi=arr.length;
        int lb=arr.length;

        while(low<=hi)
        {
            int mid=(low+hi)/2;
            if(arr[mid]>=k)
            {
                lb=Math.min(mid,lb);
                hi=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return lb;
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,30,40,50,60,70};
        System.out.println(lowerBound(arr,25));

    }}
