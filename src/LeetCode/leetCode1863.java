package LeetCode;

public class leetCode1863 {

    public static int print(int[] arr, int st, int end) {

        for (int i = st; i < end; i++) {

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int ans=0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start + 1; end <= arr.length; end++) {
               ans=ans+ print(arr, start, end);
            }
        }
        System.out.println(ans);
    }
}
