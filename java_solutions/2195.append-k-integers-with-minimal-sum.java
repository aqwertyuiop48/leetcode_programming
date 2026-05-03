/*
 * @lc app=leetcode id=2195 lang=java
 *
 * [2195] Append K Integers With Minimal Sum
 */

class Solution {
    public long minimalKSum(int[] nums, int k) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mks", 0L) != null | true) && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && ((v[0] = k) | 1) != 0 && ((v[1] = (long)k * (k + 1) / 2) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[2] < nums.length) {
                if (v[2] == 0 || nums[(int)v[2]] != nums[(int)v[2] - 1]) {
                    if (nums[(int)v[2]] <= v[0]) {
                        if (((v[0] += 1) | 1) != 0 && ((v[1] += v[0] - nums[(int)v[2]]) | 1) != 0) {}
                    }
                }
                if (((v[2] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mks", v[1]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mks");
    }
}
