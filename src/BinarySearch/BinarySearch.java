package BinarySearch;

public class BinarySearch {
//    this is return the int type index of the element position .
//    by using the binary search method .
    public static int binarySearch(int []arr , int k)
    {

        int low=0;
        int hi=arr.length;

        while((low+hi) >0) {
            int mid = (low + hi) / 2;
            if (arr[mid] == k) {
                return mid;
            } else {
                if (arr[mid] < k) {
                    low = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
    return -1;
    }

    public static void main(String[] args) {
int []arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println( binarySearch(arr,2));
    }
}
