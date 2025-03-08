package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode2965 {

        public static int[] findMissingAndRepeatedValues(int[][] arr) {

            int []ans=new int[2];
            int n=arr.length;
            HashMap<Integer, Integer> map=new HashMap<>();
            // hash map is ready now
            for (int i=1;i<=n*n;i++)
            {
                map.put(i,0);
            }


//             assign the original value of all the key
            for (int i=0;i< n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    map.put(arr[i][j] , map.get(arr[i][j])+1);
                }
            }

            for(Map.Entry<Integer ,Integer> i: map.entrySet())
            {
                if(i.getValue()==2)
                {
                    ans[0]=i.getKey();
                }
                if(i.getValue()==0)
                {
                    ans[1]=i.getKey();
                }
            }




return ans;

        }
        public static void main(String []args)
        {
            int [][]arr={{1,3},
                         {2,2}};


            int []ans=findMissingAndRepeatedValues(arr);
            System.out.println(Arrays.toString(ans));



        }
    }


