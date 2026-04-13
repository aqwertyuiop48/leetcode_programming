/*
 * @lc app=leetcode id=2418 lang=java
 *
 * [2418] Sort the People
 */

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        return IntStream.range(0, names.length)
            .boxed()
            .sorted((i, j) -> heights[j] - heights[i])
            .map(i -> names[i])
            .toArray(String[]::new);
    }
}
