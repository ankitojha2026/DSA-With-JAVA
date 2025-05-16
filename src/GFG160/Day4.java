package GFG160;

import java.util.*;

public class Day4 {

    public static List<Integer> majority(int []arr)
    {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer>map =new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
                map.put(arr[i],map.getOrDefault(arr[i] , 0)+1);
        }

        for(Map.Entry<Integer,Integer> i : map.entrySet())
        {
            if(i.getValue()> arr.length/3)
            {
                ans.add(i.getKey());

            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {

        int []arr={1,2,3,3,3,3,4};
        System.out.println(majority(arr));

    }
}
