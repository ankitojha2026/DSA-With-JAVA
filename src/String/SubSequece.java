package String;

import javax.print.DocFlavor;

public class SubSequece {
    public static void main(String[] args) {
        char []arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a'};
        String str1="zc";
        String str2="ad";
        int idx=0;
        StringBuilder temp= new StringBuilder();
        for(char i2 : str2.toCharArray()) {
            for (char i1 : str1.toCharArray()) {
                if (i2 == i1) {

                    temp.append(Character.toString(i1));
                    break;
                } else {
                    if (i2 == arr[(i1 - 97) + 1]) {
                        temp.append(Character.toString( arr[i1 - 97] + 1));
                        break;
                    }

                }
            }
        }

            System.out.println((temp+"").contains(str2));
        System.out.println(temp);

    }
}
