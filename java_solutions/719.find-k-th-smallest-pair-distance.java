/*
 * @lc app=leetcode id=719 lang=java
 *
 * [719] Find K-th Smallest Pair Distance
 */

class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, nums.length} instanceof int[] v) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if (((nums = Arrays.stream(nums).sorted().toArray()) != null) || true) {
                        if (((v[1] = 0) | 1) != 0 && ((v[2] = nums[v[7] - 1] - nums[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] <= v[2]) {
                        if (((v[3] = v[1] + (v[2] - v[1]) / 2) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((k = v[1]) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[5] < v[7]) {
                        while (v[6] < v[7] && nums[v[6]] - nums[v[5]] <= v[3]) {
                            if (((v[6] += 1) | 1) != 0) {}
                        }
                        if (((v[4] += v[6] - v[5] - 1) | 1) != 0 && ((v[5] += 1) | 1) != 0) {}
                    } else {
                        if (v[4] >= k) {
                            if (((v[2] = v[3] - 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = v[3] + 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return k;
    }
}
