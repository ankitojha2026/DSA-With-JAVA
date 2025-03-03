package Array50Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode2161PivoteElement {
    public static void main(String[] args) {

        int []arr={9,12,5,10,14,3,10};
        int p=10;

        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        int pcount=0;

        for (int i = 0; i < arr.length; i++) {
            if(p>arr[i])
            {
                l1.add(arr[i]);
            }
            else if(p<arr[i])
            {
                l2.add(arr[i]);
            }
            else
            {
                pcount++;
            }

        }

        System.out.println(l1);
        System.out.println(pcount);
        System.out.println(l2);
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<l1.size();i++)
        {
            ans.add(l1.get(i));
        }
        for(int i=1;i<=pcount;i++)
        {
            ans.add(p);
        }
        for(int i=0;i<l2.size();i++)
        {
            ans.add(l2.get(i));
        }
        int[] array = ans.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(array));



    }
}
