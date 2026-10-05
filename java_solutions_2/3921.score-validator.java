/*
 * @lc app=leetcode id=3921 lang=java
 *
 * [3921] Score Validator
 */

class Solution {
public int[] scoreValidator(String[] events) {
    return Arrays.stream(events).collect(() -> new int[2], (st, e) -> st[0] += st[1] >= 10 ? 0 : e.equals("W") ? 0 * (st[1]++) : e.equals("WD") || e.equals("NB") ? 1 : Integer.parseInt(e), (a, b) -> {});
}
}
