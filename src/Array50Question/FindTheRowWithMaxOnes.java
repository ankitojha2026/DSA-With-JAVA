package Array50Question;

import java.util.Scanner;
public class FindTheRowWithMaxOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maxRow=0;
        int idx=-1;
        System.out.println("enter row and col:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("enter element");
        int [][]arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            int sum=0;
            for (int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1)
                {
                    sum+=1;
                }
            }
            if(sum>maxRow)
            {
                maxRow=sum;
                idx=i;
            }
        }


        System.out.println(maxRow+" "+idx);



    }
}
