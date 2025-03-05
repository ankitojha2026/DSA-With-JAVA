package LeetCode;

public class leetcode {
    public static void main(String[] args) {

        int n=4;
        int nc1=0;
        int nc=0;
        for(int i=1;i<=n;i++)
        {
            nc+=2*i-1;
            if(n-1==i)
            {
                nc1=nc;
            }

        }

        System.out.println(nc+nc1);

    }
}
