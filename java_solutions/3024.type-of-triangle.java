/*
 * @lc app=leetcode id=3024 lang=java
 *
 * [3024] Type of Triangle
 */

class Solution {
    public String triangleType(int[] nums) {
        return Arrays.stream(nums).sorted().toArray() instanceof int[] s && s[0] + s[1] <= s[2] ? "none" : 
            Arrays.stream(nums).distinct().count() == 1 ? "equilateral" : 
            Arrays.stream(nums).distinct().count() == 2 ? "isosceles" : "scalene";
    }
}
