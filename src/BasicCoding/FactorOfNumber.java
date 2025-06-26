package BasicCoding;

import java.util.Scanner;
public class FactorOfNumber {

    public static void printFactor(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                System.out.println(i + " x");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=sc.nextInt();
        printFactor(n);
    }
}
