/*
 * @lc app=leetcode id=2542 lang=java
 *
 * [2542] Maximum Subsequence Score
 */

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        if (new int[nums1.length][2] instanceof int[][] arr && new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "ms", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums1.length) { if (((arr[(int)v[0]][0] = nums1[(int)v[0]]) | 1) != 0 && ((arr[(int)v[0]][1] = nums2[(int)v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if ((arr = java.util.Arrays.stream(arr).sorted((a, b) -> Integer.compare(b[1], a[1])).toArray(int[][]::new)) != null && new java.util.PriorityQueue<Integer>() instanceof java.util.PriorityQueue pq && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums1.length) {
                    if (pq.add(arr[(int)v[0]][0]) | true && ((v[1] += arr[(int)v[0]][0]) | 1) != 0) {
                        if (pq.size() > k) { if (((v[1] -= (int)pq.poll()) | 1) != 0) {} }
                        if (pq.size() == k && v[1] * arr[(int)v[0]][1] > v[2]) { if (((v[2] = v[1] * arr[(int)v[0]][1]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ms", v[2]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "ms");
    }
}
