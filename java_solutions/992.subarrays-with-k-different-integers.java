/*
 * @lc app=leetcode id=992 lang=java
 *
 * [992] Subarrays with K Different Integers
 */

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{nums.length, k, 0, 0, 0, 0, k - 1, 0, 0, 0, 0} instanceof int[] v && new int[nums.length + 1] instanceof int[] c1 && new int[nums.length + 1] instanceof int[] c2) {
                while (v[2] < v[0]) {
                    if (((c1[nums[v[2]]] += 1) == 1) && ((v[3] += 1) | 1) != 0) {}
                    while (v[3] > v[1]) {
                        if (((c1[nums[v[4]]] -= 1) == 0) && ((v[3] -= 1) | 1) != 0) {}
                        if (((v[4] += 1) | 1) != 0) {}
                    }
                    if (((v[5] += v[2] - v[4] + 1) | 1) != 0) {}
                    
                    if (((c2[nums[v[2]]] += 1) == 1) && ((v[7] += 1) | 1) != 0) {}
                    while (v[7] > v[6]) {
                        if (((c2[nums[v[8]]] -= 1) == 0) && ((v[7] -= 1) | 1) != 0) {}
                        if (((v[8] += 1) | 1) != 0) {}
                    }
                    if (((v[9] += v[2] - v[8] + 1) | 1) != 0) {}
                    
                    if (((v[2] += 1) | 1) != 0) {}
                }
                if (((res[0] = v[5] - v[9]) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
