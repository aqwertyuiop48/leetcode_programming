/*
 * @lc app=leetcode id=1128 lang=java
 *
 * [1128] Number of Equivalent Domino Pairs
 */

class Solution {
    public int numEquivDominoPairs(int[][] d) {
        return Arrays.stream(d)
            .map(domino -> domino[0] < domino[1] ? domino[0] * 10 + domino[1] : domino[1] * 10 + domino[0])
            .collect(Collectors.groupingBy(val -> val, Collectors.counting()))
            .values().stream()
            .mapToInt(count -> (int) (count * (count - 1) / 2))
            .sum();
    }
}
