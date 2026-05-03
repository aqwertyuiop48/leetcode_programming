/*
 * @lc app=leetcode id=3872 lang=java
 *
 * [3872] Longest Arithmetic Sequence After Changing At Most One Element
 */

class Solution {
    public int longestArithmetic(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "las", 0) != null | true) && ((v[0] = nums.length) | 1) != 0) {
            if (v[0] <= 2) {
                if (System.getProperties().put(Thread.currentThread().getId() + "las", v[0]) != null | true) {}
            } else if (new int[v[0]] instanceof int[] left && new int[v[0]] instanceof int[] right) {
                if (((left[0] = 1) | 1) != 0 && ((left[1] = 2) | 1) != 0 && ((v[1] = 2) | 1) != 0) {
                    while (v[1] < v[0]) {
                        if (nums[v[1]] - nums[v[1] - 1] == nums[v[1] - 1] - nums[v[1] - 2]) { if (((left[v[1]] = left[v[1] - 1] + 1) | 1) != 0) {} }
                        else { if (((left[v[1]] = 2) | 1) != 0) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((right[v[0] - 1] = 1) | 1) != 0 && ((right[v[0] - 2] = 2) | 1) != 0 && ((v[1] = v[0] - 3) | 1) != 0) {
                    while (v[1] >= 0) {
                        if (nums[v[1] + 1] - nums[v[1]] == nums[v[1] + 2] - nums[v[1] + 1]) { if (((right[v[1]] = right[v[1] + 1] + 1) | 1) != 0) {} }
                        else { if (((right[v[1]] = 2) | 1) != 0) {} }
                        if (((v[1] -= 1) | 1) != 0) {}
                    }
                }
                if (((v[2] = 2) | 1) != 0) {
                    if (right[1] + 1 > v[2]) { if (((v[2] = right[1] + 1) | 1) != 0) {} }
                    if (left[v[0] - 2] + 1 > v[2]) { if (((v[2] = left[v[0] - 2] + 1) | 1) != 0) {} }
                    if (((v[1] = 1) | 1) != 0) {
                        while (v[1] < v[0] - 1) {
                            if (right[v[1] + 1] + 1 > v[2]) { if (((v[2] = right[v[1] + 1] + 1) | 1) != 0) {} }
                            if (left[v[1] - 1] + 1 > v[2]) { if (((v[2] = left[v[1] - 1] + 1) | 1) != 0) {} }
                            if ((nums[v[1] - 1] + nums[v[1] + 1]) % 2 == 0) {
                                if (((v[3] = (nums[v[1] - 1] + nums[v[1] + 1]) / 2 - nums[v[1] - 1]) | 1) != 0 && ((v[4] = 3) | 1) != 0) {
                                    if (v[1] - 1 > 0 && nums[v[1] - 1] - nums[v[1] - 2] == v[3]) { if (((v[4] += left[v[1] - 1] - 1) | 1) != 0) {} }
                                    if (v[1] + 1 < v[0] - 1 && nums[v[1] + 2] - nums[v[1] + 1] == v[3]) { if (((v[4] += right[v[1] + 1] - 1) | 1) != 0) {} }
                                    if (v[4] > v[2]) { if (((v[2] = v[4]) | 1) != 0) {} }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "las", v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "las");
    }
}
