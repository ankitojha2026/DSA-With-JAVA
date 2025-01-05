package Array50Question;

import java.util.HashMap;
public class MaxFrequencyOfTheNumber {
    public static void main(String[] args) {

        int []arr={1,2,3,4,5,1,2,3,4,1,2,1,2,1,2,3,4,5,6,2,1,1,1,1,1,1,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        int MaxNo=0;
        int MaxFr=-1;
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>MaxFr)
            {
                MaxNo=arr[i];
                MaxFr=map.get(arr[i]);
            }

        }
        System.out.println("Max number:"+MaxNo+"  frequencey : "+MaxFr);


    }
}
