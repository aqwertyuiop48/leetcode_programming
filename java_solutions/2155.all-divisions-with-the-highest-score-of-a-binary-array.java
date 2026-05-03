/*
 * @lc app=leetcode id=2155 lang=java
 *
 * [2155] All Divisions With the Highest Score of a Binary Array
 */

class Solution {
    public java.util.List<Integer> maxScoreIndices(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("msi", new java.util.ArrayList<Integer>()) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (nums[v[0]++] == 1) { if (((v[1] += 1) | 1) != 0) {} } }
                if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = v[1]) | 1) != 0 && ((v[4] = v[1]) | 1) != 0 && System.getProperties().get("msi") instanceof java.util.List res && res.add(0) | true) {
                    while (v[0] < nums.length) {
                        if (nums[v[0]] == 0) { if (((v[2] += 1) | 1) != 0) {} } else { if (((v[3] -= 1) | 1) != 0) {} }
                        if (v[2] + v[3] > v[4]) { if (((v[4] = v[2] + v[3]) | 1) != 0 && res.removeAll(res) | true && res.add(v[0] + 1) | true) {} }
                        else if (v[2] + v[3] == v[4]) { if (res.add(v[0] + 1) | true) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("msi");
    }
}
