package String;

public class MaxSubStringRepaited {
    public static void main(String[] args) {
        String s="AAAABAAABBBBB";
        int max=0;
        char frq=s.charAt(0);
        for(int i=0;i<s.length();i++)
        {
            int sum=0;
            for(int j=i;j<s.length();j++) {
                if (s.charAt(i) != s.charAt(j))
                    break;
                sum++;

            }
            if(sum>max)
            {
                max=sum;
                frq=s.charAt(i);
            }
        }
        System.out.println(frq+" : "+max);
    }
}
