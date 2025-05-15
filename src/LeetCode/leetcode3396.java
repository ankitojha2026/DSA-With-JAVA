package LeetCode;

import java.util.*;
import java.util.HashMap;

public class leetcode3396 {
    public static void main(String[] args) {
        int []arr={4,5,6,4,4};

        HashMap<Integer,Integer>map=new HashMap<>();

        List<Integer> list=new ArrayList<>();


        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }

        for(int i=0;i<arr.length ;i++)
        {

            if(map.containsKey(arr[i]))
            {
                map.put(arr[i] , map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }


        System.out.println(map);
        int i=0;
        int ans=0;
        while(i < list.size() && list.size()>3 && i!=list.size()-3)
        {
            if(map.get(arr[i]) >1 || map.get(arr[i+1]) >1 || map.get(arr[i+2])>1)
            {
               list.remove(0);
               list.remove(1);
               list.remove(2);
               ans++;
               i=0;
            }
            i++;
        }
        if(list.size()==2 || list.size()==1)
        {
            System.out.println(ans+1);
            return;
        }
        System.out.println(ans);

    }
}
