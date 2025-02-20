package BasicCoding;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void check(int n)
    {
        if(n%2==0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Integer Number :");

                int num = sc.nextInt();
                check(num);
    }
}
