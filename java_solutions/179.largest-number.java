/*
 * @lc app=leetcode id=179 lang=java
 *
 * [179] Largest Number
 */

class Solution {
    public String largestNumber(int[] nums) {
        return Arrays.stream(nums) .mapToObj(String::valueOf) .sorted((a, b) -> (b + a).compareTo(a + b)) .collect(Collectors.collectingAndThen( Collectors.joining(), s -> s.startsWith("0") ? "0" : s));
    }
}
