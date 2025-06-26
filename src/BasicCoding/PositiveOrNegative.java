package BasicCoding;

import java.util.Scanner;

// given input is negative of positive or natural
public class PositiveOrNegative {

    public static String check(int a) {
        if (a == 0) {
            return "netural";
        } else {
            if (a > 0) return "positive";
        }
        return "negative number";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int a=sc.nextInt();
        System.out.println(check(a));
    }
}
