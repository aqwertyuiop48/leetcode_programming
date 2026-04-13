/*
 * @lc app=leetcode id=3686 lang=java
 *
 * [3686] Number of Stable Subsequences
 */

class Solution {
    public int countStableSubsequences(int[] A) {
        return Stream.<long[]>of(new long[]{1, 0, 0, 0, 0, 0, 1_000_000_007L})
          .peek(s -> IntStream.of(A).allMatch(a -> (a % 2 != 0) ? 
              (s[2] = (s[2] + s[1]) % s[6]) >= 0 && 
              (s[1] = (s[1] + s[0] + s[3] + s[4] + s[5]) % s[6]) >= 0 : 
              (s[5] = (s[5] + s[4]) % s[6]) >= 0 && 
              (s[4] = (s[4] + s[3] + s[0] + s[1] + s[2]) % s[6]) >= 0))
          .mapToInt(s -> (int) ((s[1] + s[2] + s[4] + s[5]) % s[6])).findFirst().getAsInt();
    }
}
