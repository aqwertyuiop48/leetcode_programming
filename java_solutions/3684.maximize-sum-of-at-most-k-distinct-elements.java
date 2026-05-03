/*
 * @lc app=leetcode id=3684 lang=java
 *
 * [3684] Maximize Sum of At Most K Distinct Elements
 */

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "msak", new int[0]) != null | true) && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && new int[k] instanceof int[] ans && ((v[0] = nums.length - 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
            while (v[0] >= 0 && v[1] < k) {
                if (nums[v[0]] != v[2]) {
                    if (((v[2] = nums[v[0]]) | 1) != 0 && ((ans[v[1]++] = nums[v[0]]) | 1) != 0) {}
                }
                if (((v[0] -= 1) | 1) != 0) {}
            }
            if (((v[3] = 0) | 1) != 0 && new int[v[1]] instanceof int[] finalAns) {
                while (v[3] < v[1]) { if (((finalAns[v[3]] = ans[v[3]]) | 1) != 0 && ((v[3] += 1) | 1) != 0) {} }
                if (System.getProperties().put(Thread.currentThread().getId() + "msak", finalAns) != null | true) {}
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "msak");
    }
}
