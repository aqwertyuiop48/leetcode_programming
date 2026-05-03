/*
 * @lc app=leetcode id=1247 lang=java
 *
 * [1247] Minimum Swaps to Make Strings Equal
 */

class Solution {
    public int minimumSwap(String s1, String s2) {
        return new int[]{(int)java.util.stream.IntStream.range(0, s1.length()).filter(i -> s1.charAt(i) != s2.charAt(i) && s1.charAt(i) == 'x').count(), (int)java.util.stream.IntStream.range(0, s1.length()).filter(i -> s1.charAt(i) != s2.charAt(i) && s1.charAt(i) == 'y').count()} instanceof int[] c ? ((c[0] + c[1]) % 2 != 0 ? -1 : c[0] / 2 + c[1] / 2 + (c[0] % 2) * 2) : -1;
    }
}
