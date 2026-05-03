/*
 * @lc app=leetcode id=2654 lang=java
 *
 * [2654] Minimum Number of Operations to Make All Array Elements Equal to 1
 */

class Solution {
    public int minOperations(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mno1", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (nums[v[0]++] == 1) { if (((v[1] += 1) | 1) != 0) {} } }
                if (v[1] > 0) { if (System.getProperties().put("mno1", nums.length - v[1]) != null | true) {} }
                else if (((v[2] = 999999) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((v[3] = nums[v[0]]) | 1) != 0 && ((v[4] = v[0] + 1) | 1) != 0) {
                            while (v[4] < nums.length) {
                                if (((v[5] = v[3]) | 1) != 0 && ((v[6] = nums[v[4]]) | 1) != 0) {
                                    while (v[6] > 0) { if (((v[7] = v[5] % v[6]) | 1) != 0 && ((v[5] = v[6]) | 1) != 0 && ((v[6] = v[7]) | 1) != 0) {} }
                                    if (((v[3] = v[5]) | 1) != 0 && v[3] == 1) { if (v[4] - v[0] + 1 < v[2]) { if (((v[2] = v[4] - v[0] + 1) | 1) != 0) {} } }
                                }
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (v[2] != 999999) { if (System.getProperties().put("mno1", v[2] - 1 + nums.length - 1) != null | true) {} }
                }
            }
        }
        return (int) System.getProperties().get("mno1");
    }
}
