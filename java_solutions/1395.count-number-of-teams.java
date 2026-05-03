/*
 * @lc app=leetcode id=1395 lang=java
 *
 * [1395] Count Number of Teams
 */

class Solution {
    public int numTeams(int[] rating) {
        return java.util.stream.IntStream.range(1, rating.length - 1).map(i -> (int)java.util.stream.IntStream.range(0, i).filter(j -> rating[j] < rating[i]).count() * (int)java.util.stream.IntStream.range(i + 1, rating.length).filter(k -> rating[i] < rating[k]).count() + (int)java.util.stream.IntStream.range(0, i).filter(j -> rating[j] > rating[i]).count() * (int)java.util.stream.IntStream.range(i + 1, rating.length).filter(k -> rating[i] > rating[k]).count()).sum();
    }
}
