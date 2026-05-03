/*
 * @lc app=leetcode id=3847 lang=java
 *
 * [3847] Find the Score Difference in a Game
 */

class Solution {
    public int scoreDifference(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fsd", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] % 2 != 0) { if (((v[1] = -v[1]) | 1) != 0) {} }
                if ((v[0] + 1) % 6 == 0) { if (((v[1] = -v[1]) | 1) != 0) {} }
                if (((v[2] += v[1] * nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "fsd", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fsd");
    }
}
