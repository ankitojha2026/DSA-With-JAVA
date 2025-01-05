package Array50Question;

import java.util.*;
public class basicHashSet {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        //for adding value inside the hashset using put(key:value);
        map.put(1,2);
        System.out.println(map);
        map.put(2,3);

        // for geting the value form the hashmap using get(key);

        System.out.println(map.get(1));

        //if value is not present then we can use the getOrDefault(key)

        System.out.println(map.getOrDefault(4,0));

        //for checking the item is present or not it return true or false
        System.out.println(map.containsKey(3));

        //for replace the value of the Items using replace(key,value)

        map.replace(2,4);
        System.out.println(map);

        // for iterating the map using the foreach loop

        for(Map.Entry <Integer,Integer> i: map.entrySet())
        {
            System.out.println(i.getKey()+" "+ i.getValue());

        }



    }
}
