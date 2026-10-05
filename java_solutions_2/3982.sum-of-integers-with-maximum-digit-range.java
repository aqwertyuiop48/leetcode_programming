/*
 * @lc app=leetcode id=3982 lang=java
 *
 * [3982] Sum of Integers with Maximum Digit Range
 */

class Solution {
public int maxDigitRange(int[] nums) {
    return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(x -> String.valueOf(x).chars().max().getAsInt() - String.valueOf(x).chars().min().getAsInt(), TreeMap::new, Collectors.summingInt(x -> x))).lastEntry().getValue();
}
}
