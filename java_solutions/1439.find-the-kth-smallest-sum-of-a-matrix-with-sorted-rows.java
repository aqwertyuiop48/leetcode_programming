/*
 * @lc app=leetcode id=1439 lang=java
 *
 * [1439] Find the Kth Smallest Sum of a Matrix With Sorted Rows
 */

class Solution {
    public int kthSmallest(int[][] mat, int k) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new Object[]{new PriorityQueue<Integer>((a, b) -> Integer.compare(b, a)), new PriorityQueue<Integer>((a, b) -> Integer.compare(b, a))} instanceof Object[] st && new int[]{0, 0, 0, 0, 0, 0} instanceof int[] v) {
                if (((PriorityQueue<Integer>)st[0]).offer(0) || true) {
                    while (v[0] < mat.length) {
                        if (((st[1] = new PriorityQueue<Integer>((a, b) -> Integer.compare(b, a))) != null) && ((v[1] = ((PriorityQueue<Integer>)st[0]).size()) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                            while (v[2] < v[1]) {
                                if (((v[3] = ((PriorityQueue<Integer>)st[0]).poll()) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                    while (v[4] < Math.min(mat[0].length, k)) {
                                        if (((PriorityQueue<Integer>)st[1]).offer(v[3] + mat[v[0]][v[4]]) || true) {
                                            if (((PriorityQueue<Integer>)st[1]).size() > k) {
                                                if (((v[5] = ((PriorityQueue<Integer>)st[1]).poll()) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                            if (((st[0] = st[1]) != null) && ((v[0] += 1) | 1) != 0) {}
                        }
                    }
                    if (((res[0] = ((PriorityQueue<Integer>)st[0]).peek()) | 1) != 0) {}
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
