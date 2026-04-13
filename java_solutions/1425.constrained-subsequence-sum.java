/*
 * @lc app=leetcode id=1425 lang=java
 *
 * [1425] Constrained Subsequence Sum
 */

class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new Object[]{new PriorityQueue<int[]>((a, b) -> Integer.compare(b[0], a[0]))} instanceof Object[] st && new int[]{nums[0], 1, 0} instanceof int[] v) {
                if (((PriorityQueue<int[]>)st[0]).offer(new int[]{nums[0], 0}) || true) {
                    while (v[1] < nums.length) {
                        while (v[1] - ((PriorityQueue<int[]>)st[0]).peek()[1] > k) {
                            if (((PriorityQueue<int[]>)st[0]).poll() != null) {}
                        }
                        if (((v[2] = Math.max(0, ((PriorityQueue<int[]>)st[0]).peek()[0]) + nums[v[1]]) | 1) != 0) {
                            if (((v[0] = Math.max(v[0], v[2])) | 1) != 0 && (((PriorityQueue<int[]>)st[0]).offer(new int[]{v[2], v[1]}) || true)) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (((res[0] = v[0]) | 1) != 0) {}
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
