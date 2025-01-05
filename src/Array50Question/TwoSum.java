package Array50Question;

import java.util.*;
import java.lang.*;
public class TwoSum {
    public static void main(String[] args) {
        int arr[]={3,2,10,11,7,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your target:");
        int k=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
         map.put(arr[i],i);

        }
        for (int i=0;i<arr.length;i++)
        {
            int y=k-arr[i];
            if (map.containsKey(y))
            {
                System.out.println(i+"   "+map.get(y));

            }
        }
        System.out.println(map);
    }
}
