package Array50Question;

import java.util.*;
public class FindDuplicateElement {
    public static void main(String[] args) {

        int []arr={1,2,342,3,4,4};
        HashMap<Integer,Integer> map =new HashMap<>();

        for(int i=0;i<arr.length;i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if (map.get(arr[i]) > 1) {
                System.out.println(arr[i]);
            }

        }

    }
}
