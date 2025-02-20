package BasicCoding;
import java.util.Scanner;
public class numberIsArmstrongOrNot {

    public static boolean isArmstron(int num)
    {
        int temp=num;
        int ans=0;
        while(num>0)
        {
            int x=num%10;
            ans+=Math.pow(x,3);
            num/=10;
        }
        if(ans==temp)
            return true;


        return false;
    }
    public static void main(String[] args) {
        System.out.println(isArmstron(153));
    }
}