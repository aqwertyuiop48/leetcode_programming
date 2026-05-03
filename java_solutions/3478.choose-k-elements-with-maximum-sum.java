/*
 * @lc app=leetcode id=3478 lang=java
 *
 * [3478] Choose K Elements With Maximum Sum
 */

class Solution {
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        if (new long[nums1.length] instanceof long[] ans && new int[nums1.length][3] instanceof int[][] arr && new java.util.PriorityQueue<Integer>() instanceof java.util.PriorityQueue pq && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "cke", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums1.length) {
                    if (((arr[v[0]][0] = nums1[v[0]]) | 1) != 0 && ((arr[v[0]][1] = nums2[v[0]]) | 1) != 0 && ((arr[v[0]][2] = v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if ((arr = java.util.Arrays.stream(arr).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0) {
                while (v[0] < arr.length) {
                    while (v[1] < v[0] && arr[v[1]][0] < arr[v[0]][0]) {
                        if (pq.offer(arr[v[1]][1]) | true && ((lv[0] += arr[v[1]][1]) | 1) != 0) {
                            if (pq.size() > k) { if (((lv[0] -= (int)pq.poll()) | 1) != 0) {} }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (((ans[arr[v[0]][2]] = lv[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (long[]) System.getProperties().get(Thread.currentThread().getId() + "cke");
    }
}
