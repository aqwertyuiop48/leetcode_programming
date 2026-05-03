/*
 * @lc app=leetcode id=2044 lang=java
 *
 * [2044] Count Number of Maximum Bitwise-OR Subsets
 */

class Solution {
    public int countMaxOrSubsets(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cmo", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (((v[1] |= nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < (1 << nums.length)) {
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[3] < nums.length) {
                            if ((v[0] & (1 << v[3])) != 0) { if (((v[2] |= nums[v[3]]) | 1) != 0) {} }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                        if (v[2] == v[1]) { if (((v[4] += 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cmo", v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cmo");
    }
}
