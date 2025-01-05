import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class test{
    public static void sum(int []arr1,int []arr2)
    {
        StringBuilder x=new StringBuilder();
        StringBuilder y=new StringBuilder();
        for(int i=0;i<arr1.length;i++)
        {
            x.append(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
         y.append(arr2[i]);
        }
        System.out.println(x);
        System.out.println(y);

        BigInteger sum1=new BigInteger(x+"");
        BigInteger sum2=new BigInteger(y+"");
        BigInteger result=sum1.add(sum2);
        String ans=result.toString();
        System.out.println(ans);
        for(int i=0;i<ans.length();i++)
        {
            System.out.println(Character.getNumericValue(ans.charAt(i)));
        }




    }
    public static void main(String[] args) {
int arr1[]={1,2,3,4,5,6,7},arr2[]={1,2,3,4,5,67,8};
sum(arr1,arr2);
    }
}