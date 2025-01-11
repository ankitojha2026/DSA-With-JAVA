package String;


import java.util.HashMap;

public class ConstractPelindrome {

        public static boolean canConstruct(String s, int k) {
            // If the number of required palindromes is greater than the length of the string, it's not possible
            if (k > s.length()) {
                return false;
            }

            // Map to count character frequencies
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            System.out.println("Character Frequencies: " + map);

            // Count characters with odd frequencies
            int oddCount = 0;
            for (int freq : map.values()) {
                if (freq % 2 != 0) {
                    oddCount++;
                }
            }

            // To form `k` palindromes, there can be at most `k` odd-count characters
            return oddCount <= k;
        }

        public static void main(String[] args) {
            String s = "annabelle";
            int k = 2;
            System.out.println("Can construct " + k + " palindrome strings? " + canConstruct(s, k));
        }
    }

