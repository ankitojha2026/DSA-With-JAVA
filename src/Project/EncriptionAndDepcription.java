package Project;

import java.util.*;
import java.lang.*;
public class EncriptionAndDepcription {

    public static void dpcription(String s)
    {
        StringBuilder encripted=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            int x=(int)s.charAt(i);
            int formula=x+40;
            encripted.append((char)formula);
        }
        System.out.println(encripted);

    }



    public static String encription(String s)
    {
        StringBuilder encripted=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            int x=(int)s.charAt(i);
            int formula=x-40;
            encripted.append((char)formula);
        }
        System.out.println(encripted);
return encripted+"";
    }
    public static void main(String[] args) {
        String x=encription("Hello world");
        dpcription(x);
    }
}
