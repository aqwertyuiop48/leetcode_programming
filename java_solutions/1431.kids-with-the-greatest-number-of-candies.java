/*
 * @lc app=leetcode id=1431 lang=java
 *
 * [1431] Kids With the Greatest Number of Candies
 */

class Solution {
    public java.util.List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        return new int[]{java.util.Arrays.stream(candies).max().getAsInt()} instanceof int[] m ? java.util.Arrays.stream(candies).mapToObj(c -> c + extraCandies >= m[0]).collect(java.util.stream.Collectors.toList()) : null;
    }
}
