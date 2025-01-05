package preFixSum;

public class FindSubArrayWithZero {
    public static void main(String[] args) {
        int arr[]={4,2,-3,1,6};
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        //prefix sum of the array
        for (int i=1;i<arr.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(prefix[i]==prefix[j]) {
                    System.out.println((i+1)+" "+j);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
