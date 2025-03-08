package LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
public class leetcode2523 {

//    public static boolean isPrime(int num)
//    {
//        if(num==2)
//        {
//            return true;
//        }
//
//        if(num%2==0)
//        {
//            return false;
//        }else {
//
//            for (int i=3;i<num/2;i=i+2)
//            {
//                if(num%i==0)
//                {
//                    return false;
//                }
//            }
//
//
//        }
//
//        return true;
//
//    }
//
//
//    public static int[] closestPrimes(int left, int right) {
//    int []arr=new int[2];
//
//    int num1=-1; int num2=-1; int gap=Integer.MAX_VALUE;
//
//
//
//    return arr;
//    }

    public static void main(String[] args) {
        int left=10;
        int right=19;
//      int []arr=closestPrimes(left,right);
        ArrayList<Integer>nl=new ArrayList<>(2);
        ArrayList<ArrayList<Integer>>l=new ArrayList<>();
        nl.add(0);
        nl.add(0);
        nl.set(0,2);
        nl.set(1,3);
        l.add(nl);
        nl.set(0,2);
        nl.set(1,3);
        l.add(nl);
        nl.set(0,4);
        nl.set(1,3);
        l.add(nl);
        System.out.println(l);


    }
}
