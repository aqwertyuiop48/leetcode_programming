/*
 * @lc app=leetcode id=3488 lang=java
 *
 * [3488] Closest Equal Element Queries
 */

class Solution {
    public java.util.List<Integer> solveQueries(int[] nums, int[] queries) {
        if (new int[nums.length] instanceof int[] d && new int[queries.length] instanceof int[] ans && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap left && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap right && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ceeq", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((d[v[0]++] = 2000000000) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length * 2) {
                    if (left.containsKey(nums[v[0] % nums.length])) {
                        if (v[0] - (int)left.get(nums[v[0] % nums.length]) < d[v[0] % nums.length]) {
                            if (((d[v[0] % nums.length] = v[0] - (int)left.get(nums[v[0] % nums.length])) | 1) != 0) {}
                        }
                    }
                    if (left.put(nums[v[0] % nums.length], v[0]) != null | true && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = nums.length * 2 - 1) | 1) != 0) {
                while (v[0] >= 0) {
                    if (right.containsKey(nums[v[0] % nums.length])) {
                        if ((int)right.get(nums[v[0] % nums.length]) - v[0] < d[v[0] % nums.length]) {
                            if (((d[v[0] % nums.length] = (int)right.get(nums[v[0] % nums.length]) - v[0]) | 1) != 0) {}
                        }
                    }
                    if (right.put(nums[v[0] % nums.length], v[0]) != null | true && ((v[0] -= 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < queries.length) {
                    if (((ans[v[0]] = d[queries[v[0]]] >= nums.length ? -1 : d[queries[v[0]]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return java.util.Arrays.stream((int[]) System.getProperties().get(Thread.currentThread().getId() + "ceeq")).boxed().collect(java.util.stream.Collectors.toList());
    }
}
