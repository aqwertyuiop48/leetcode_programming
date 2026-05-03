/*
 * @lc app=leetcode id=3727 lang=java
 *
 * [3727] Maximum Alternating Sum of Squares
 */

class Solution {
    public long maxAlternatingSum(int[] nums) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mas", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((nums[(int)v[0]] = Math.abs(nums[(int)v[0]])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if ((nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0 && ((v[1] = nums.length - 1) | 1) != 0) {
                while (v[0] < v[1]) {
                    if (((v[2] += (long)nums[(int)v[1]] * nums[(int)v[1]] - (long)nums[(int)v[0]] * nums[(int)v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {}
                }
                if (v[0] == v[1] && ((v[2] += (long)nums[(int)v[0]] * nums[(int)v[0]]) | 1) != 0) {}
                if (System.getProperties().put(Thread.currentThread().getId() + "mas", v[2]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mas");
    }
}
