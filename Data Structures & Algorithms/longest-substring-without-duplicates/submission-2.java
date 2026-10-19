
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        int[] dp = new int[n];
        int max = 0;
        int left = 0;

        HashSet<Character> Seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            while (Seen.contains(s.charAt(i))) {
                Seen.remove(s.charAt(left));
                left++;
            }

            Seen.add(s.charAt(i));
            dp[i] = i - left + 1;
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
