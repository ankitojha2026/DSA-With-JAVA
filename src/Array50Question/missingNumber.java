package Array50Question;

public class missingNumber {
    public static void main(String[] args) {
        int []arr={1,2,4,5,3,6,8};
        int l=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(arr[i]>l)
                l=arr[i];
        }

        int sum1=(l*(l+1))/2;
        System.out.println( sum1-sum);

    }
}
