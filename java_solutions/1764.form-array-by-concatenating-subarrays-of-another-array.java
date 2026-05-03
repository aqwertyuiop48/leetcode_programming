/*
 * @lc app=leetcode id=1764 lang=java
 *
 * [1764] Form Array by Concatenating Subarrays of Another Array
 */

class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("ccg", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < groups.length && v[1] < nums.length) {
                    if (v[1] + groups[v[0]].length <= nums.length && ((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                        while (v[2] < groups[v[0]].length) {
                            if (nums[v[1] + v[2]] != groups[v[0]][v[2]]) { if (((v[3] = 0) | 1) != 0) {} }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (v[3] == 1) { if (((v[1] += groups[v[0]].length) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                        else { if (((v[1] += 1) | 1) != 0) {} }
                    } else {
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("ccg", v[0] == groups.length) != null | true) {}
            }
        }
        return (boolean) System.getProperties().get("ccg");
    }
}
