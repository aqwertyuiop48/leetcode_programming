/*
 * @lc app=leetcode id=4065 lang=java
 *
 * [4065] Rearrange Array by Removing Distinct Values
 */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        return java.util.Optional.of(new java.util.HashMap<Integer, Integer>()).map(pass -> java.util.Arrays.stream(nums).mapToObj(x -> new int[]{pass.merge(x, 1, Integer::sum), x}).sorted((a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])).mapToInt(a -> a[1]).toArray()).get();
    }
}
