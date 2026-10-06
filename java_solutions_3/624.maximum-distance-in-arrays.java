/*
 * @lc app=leetcode id=624 lang=java
 *
 * [624] Maximum Distance in Arrays
 */

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        return new int[]{arrays.get(0).get(0), arrays.get(0).get(arrays.get(0).size() - 1), 0} instanceof int[] s
            && arrays.stream().skip(1).peek(a -> s[2] = Math.max(s[2], Math.max(Math.abs(a.get(a.size() - 1) - s[0]), Math.abs(s[1] - a.get(0))))
                + 0 * (s[0] = Math.min(s[0], a.get(0))) + 0 * (s[1] = Math.max(s[1], a.get(a.size() - 1)))).allMatch(x -> true)
            ? s[2] : 0;
    }
}
