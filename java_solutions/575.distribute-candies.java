/*
 * @lc app=leetcode id=575 lang=java
 *
 * [575] Distribute Candies
 */

class Solution {
    public int distributeCandies(int[] candyType) {
        return Math.min(Arrays.stream(candyType).boxed().collect(Collectors.toSet()).size(),candyType.length/2);
    }
}
