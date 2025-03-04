package LeetCode;

public class leetcode1780 {
    public static void main(String[] args) {

        int n=21;

        while(n>0)
        {
            if(n<=9 && n>=0)
            {
                if(n%3==2)
                {
                    System.out.println("false" );
                    break;
                }
            }
            n=n/3;
        }
        System.out.println("true");









    }
}
