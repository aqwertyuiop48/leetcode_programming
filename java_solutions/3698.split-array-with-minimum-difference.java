/*
 * @lc app=leetcode id=3698 lang=java
 *
 * [3698] Split Array With Minimum Difference
 */

class Solution {
    public long splitArray(int[] nums) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "sa", -1L) != null | true) && ((v[0] = nums.length) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = v[0] - 1) | 1) != 0) {
            if (((v[3] = nums[(int)v[1]]) | 1) != 0 && ((v[4] = nums[(int)v[2]]) | 1) != 0) {
                while (v[1] < v[0] - 1 && nums[(int)v[1]] < nums[(int)v[1] + 1]) { if (((v[3] += nums[(int)(v[1] += 1)]) | 1) != 0) {} }
                while (v[2] > 0 && nums[(int)v[2] - 1] > nums[(int)v[2]]) { if (((v[4] += nums[(int)(v[2] -= 1)]) | 1) != 0) {} }
                if (v[1] == v[2]) { if (System.getProperties().put(Thread.currentThread().getId() + "sa", Math.abs(Math.max(v[3], v[4]) - nums[(int)v[1]] - Math.min(v[3], v[4]))) != null | true) {} }
                else if (v[2] == v[1] + 1) { if (System.getProperties().put(Thread.currentThread().getId() + "sa", Math.abs(v[4] - v[3])) != null | true) {} }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "sa");
    }
}
