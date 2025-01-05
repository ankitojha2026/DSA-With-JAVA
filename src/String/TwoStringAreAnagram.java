package String;
//two sting anigram means that if we have given two sting
//and if the all char is present in the both string then we can say
//it is the anagram

import java.util.HashMap;
import java.util.Map;
public class TwoStringAreAnagram {
    public static void main(String[] args) {
        Map<Character,Integer>map=new HashMap<>() ;
        String s1="helloworld";
        String s2="worldlleho";

        for(int i=0;i<s1.length();i++)
        {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for (int i=0;i<s2.length();i++)
        {
            if(map.get(s2.charAt(i))!=0)
            {
                map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
            }
            else
            {
                System.out.println(map);
                return;
            }
        }

        System.out.println("Anagram");



    }
}
