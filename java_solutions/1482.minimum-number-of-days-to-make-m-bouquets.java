/*
 * @lc app=leetcode id=1482 lang=java
 *
 * [1482] Minimum Number of Days to Make m Bouquets
 */

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        return (long) m * k > bloomDay.length ? -1 : java.util.Optional.of(new int[]{1, 1000000000, -1, 0, 0, 0, 0})
            .filter(s -> new java.util.ArrayList<Integer>(java.util.Collections.nCopies(32, 0)).removeIf(dummyBS -> s[0] <= s[1] ? ((s[3] = s[0] + (s[1] - s[0]) / 2) >= 0 && (s[4] = 0) == 0 && (s[5] = 0) == 0 && (s[6] = 0) == 0 && new java.util.ArrayList<Integer>(java.util.Collections.nCopies(bloomDay.length, 0)).removeIf(dummyInner -> (bloomDay[s[6]++] <= s[3] ? ((s[5]++) >= 0 && s[5] == k ? ((s[4]++) >= 0 && (s[5] = 0) == 0) : true) : (s[5] = 0) == 0) && false) == false && (s[4] >= m ? ((s[2] = s[3]) >= 0 && (s[1] = s[3] - 1) >= -1e9) : ((s[0] = s[3] + 1) >= 0)) && false) : false) || true)
            .map(s -> s[2])
            .get();
    }
}
