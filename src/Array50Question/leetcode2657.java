package Array50Question;

public class leetcode2657 {
        public static int[] findThePrefixCommonArray(int[] A, int[] B) {
            int n = A.length;
            int[] freq = new int[n + 1];
            int[] ans = new int[n];
            int common = 0;

            for (int i = 0; i < n; i++) {
                if (++freq[A[i]] == 2) common++;
                if (++freq[B[i]] == 2) common++;
                ans[i] = common;
            }
            return ans;
        }

    public static void main(String[] args) {
       int A[]={1,3,2,4};
       int B[]={3,1,2,4};
        System.out.println(findThePrefixCommonArray(A,B));
    }
}
