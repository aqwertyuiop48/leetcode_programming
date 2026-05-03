/*
 * @lc app=leetcode id=2824 lang=java
 *
 * [2824] Count Pairs Whose Sum is Less than Target
 */

class Solution {
    public int countPairs(java.util.List<Integer> nums, int target) {
        if (new Object[]{nums.stream().sorted().collect(java.util.stream.Collectors.toList())} instanceof Object[] o && o[0] instanceof java.util.List s && new int[10] instanceof int[] v && (System.getProperties().put("cpl", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = s.size() - 1) | 1) != 0) {
                while (v[0] < v[1]) {
                    if ((int)s.get(v[0]) + (int)s.get(v[1]) < target) { if (((v[2] += v[1] - v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                    else { if (((v[1] -= 1) | 1) != 0) {} }
                }
                if (System.getProperties().put("cpl", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("cpl");
    }
}
