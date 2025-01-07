package String;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] x) {


List<String> l=new ArrayList<>();
for(int i=0;i<x.length;i++)
{
    for (int j=0;j<x.length;j++)
    {
        if (i!=j)
        {
            if(x[i].contains(x[j]))
            {
                l.add(x[j]);
                break;
            }
        }
    }
}

       return l;



    }
}


public class StringMatching {
    public static void main(String[] args) {
Solution obj =new Solution();
String []arr={"mass","as","hero","superhero"};
        System.out.println(obj.stringMatching(arr));
    }
}
