/*
 * @lc app=leetcode id=1560 lang=java
 *
 * [1560] Most Visited Sector in  a Circular Track
 */

class Solution {
    public java.util.List<Integer> mostVisited(int n, int[] rounds) {
        return java.util.stream.IntStream.rangeClosed(1, n).filter(i -> rounds[0] <= rounds[rounds.length - 1] ? (i >= rounds[0] && i <= rounds[rounds.length - 1]) : (i >= rounds[0] || i <= rounds[rounds.length - 1])).boxed().collect(java.util.stream.Collectors.toList());
    }
}
