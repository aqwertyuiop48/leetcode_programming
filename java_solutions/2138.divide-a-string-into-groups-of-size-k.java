/*
 * @lc app=leetcode id=2138 lang=java
 *
 * [2138] Divide a String Into Groups of Size k
 */

class Solution {
    public String[] divideString(String s, int k, char fill) {
        return IntStream.range(0, (s.length() + k - 1) / k)
            .mapToObj(i -> (s + String.valueOf(fill).repeat(k)).substring(i * k, i * k + k))
            .toArray(String[]::new);
    }
}
