/*
 * @lc app=leetcode id=3362 lang=java
 *
 * [3362] Zero Array Transformation III
 */

class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        if (new int[10] instanceof int[] v && new java.util.PriorityQueue<Integer>(java.util.Collections.reverseOrder()) instanceof java.util.PriorityQueue pq && (queries = java.util.Arrays.stream(queries).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null && new int[nums.length + 1] instanceof int[] diff && (System.getProperties().put(Thread.currentThread().getId() + "mza3", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < nums.length && v[3] == 0) {
                    while (v[1] < queries.length && queries[v[1]][0] <= v[0]) {
                        if (pq.offer(queries[v[1]][1]) | true && ((v[1] += 1) | 1) != 0) {}
                    }
                    if (((v[2] += diff[v[0]]) | 1) != 0) {
                        while (v[2] < nums[v[0]]) {
                            if (pq.isEmpty() || (int)pq.peek() < v[0]) { 
                                if (((v[3] = -1) | 1) != 0 && ((v[2] = nums[v[0]]) | 1) != 0) {} 
                            } else {
                                if (((diff[(int)pq.poll() + 1] -= 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[3] != -1) { if (System.getProperties().put(Thread.currentThread().getId() + "mza3", pq.size()) != null | true) {} }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mza3");
    }
}
