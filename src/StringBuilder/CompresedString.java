package StringBuilder;

public class CompresedString {
    public static void fun(StringBuilder str)
    {
        StringBuilder ans =new StringBuilder();
    int k=1;
    for(int i=1;i<str.length();i++)
    {
        char ch=str.charAt(i-1);
        if(ch==str.charAt(i))
        {
            k++;
        }
        else
        {
            ans.append(ch);
            ans.append(k);
            k=1;
        }
    }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("aaabbbccccdde");
        fun(str);

    }
}
