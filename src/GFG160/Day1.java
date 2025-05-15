package GFG160;

//second largest number ....
public class Day1 {
    public static void main(String[] args) {

        int []arr={1,2,3,4,9,5,6,7,8};
        int l=arr[0];
        int sl=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>l)
            {
                l=arr[i];

            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>sl && arr[i]!=l)
            {
                sl=arr[i];

            }
        }

        System.out.println(sl);

    }
}
