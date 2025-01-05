package String;

import java.util.*;
public class serachPefixWord {
    public static void main(String[] args) {
        String s="i love eating burger";
        String k="burg";
        String []arr=s.split(" ");
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i].length()<k.length())
           {
               continue;
           }
           else
           {
               if (arr[i].startsWith(k)){
                   System.out.println(arr[i]);
                    break;}

           }
       }
        System.out.println("-1");
    }
}
