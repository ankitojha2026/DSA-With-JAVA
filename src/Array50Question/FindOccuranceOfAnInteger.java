package Array50Question;

import java.util.*;
public class FindOccuranceOfAnInteger {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,1,2,3,4,7,5,2,3,1,4,5,7,6,10};
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
    for(Map.Entry<Integer,Integer> i: map.entrySet())
    {
        System.out.println("number : "+ i.getKey() +" frequency : "+i.getValue());
    }

    }
}
