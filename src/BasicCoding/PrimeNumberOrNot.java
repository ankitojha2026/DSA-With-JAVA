package BasicCoding;

import java.util.Scanner;

public class PrimeNumberOrNot {
    private static boolean isPrime(int num)
    {
      for(int i=2;i<num/2+1 ;i++)
      {
          if(num%i== 0)
          {
              return false;
          }
      }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number which you want to check:");
        int num=sc.nextInt();
        if(isPrime(num))
            System.out.println("Number is Prime ");
        else
            System.out.println("Number is Not Prime ");
    }
}
