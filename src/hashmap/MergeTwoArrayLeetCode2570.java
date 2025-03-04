package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MergeTwoArrayLeetCode2570 {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();

        int [][]arr1={{1,2},{2,3},{4,5}};
        int [][]arr2={{1,4},{3,2},{4,1}};

        for (int i=0;i<arr1.length ;i++)
        {
            map.put(arr1[i][0],arr1[i][1]);
        }

        for (int i=0;i<arr2.length ;i++)
        {
            if(map.containsKey(arr2[i][0]))
            {
                map.put(arr2[i][0],map.get(arr2[i][0])+arr2[i][1]);
            }
            else
            {
                map.put(arr2[i][0],arr2[i][1]);
            }

        }

        int [][]ans=new int[map.size()][2];

        int j=0;
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(map);
        for (Map.Entry<Integer, Integer> i : sortedMap.entrySet())
        {
            ans[j][0]=i.getKey();
            ans[j][1]=i.getValue();
            j++;
        }




    }
}
