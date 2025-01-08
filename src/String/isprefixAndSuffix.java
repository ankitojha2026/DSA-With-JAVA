package String;

public class isprefixAndSuffix {

    private static boolean isCheck(String str1, String str2)
    {
        if(str1.length()>str2.length())
        {
            return false;
        }
        if(str2.startsWith(str1) && str2.endsWith(str1))
        {
            return true;
        }
        return false;
    }
    public static  int check(String arr[])
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1 ;j<arr.length;j++)
            {
                if(isCheck(arr[i],arr[j]))
                {
                    ans++;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        String [] arr={"a","aba","ababa","aa"};
        System.out.println( check(arr));
    }
}
