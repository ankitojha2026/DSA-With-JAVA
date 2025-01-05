package Array50Question;

// this code is used for the rotations of the array according to the kth

import java.util.*;
public class KthRotationOfTheArray {

    static void rotate(int []arr,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the k value:");
        int k=sc.nextInt();
        rotate(arr,0,arr.length-1);
        rotate(arr,0,k-1);
        rotate(arr,k,arr.length-1);

        System.out.println(Arrays.toString(arr));


    }
}
