/*
 * @lc app=leetcode id=630 lang=java
 *
 * [630] Course Schedule III
 */

class Solution {
    public int scheduleCourse(int[][] courses) {
        if (new int[]{0, 0} instanceof int[] v && new Object[]{new PriorityQueue<Integer>((a,b) -> b - a), Arrays.stream(courses).sorted((a,b) -> Integer.compare(a[1], b[1])).toArray(int[][]::new)} instanceof Object[] obj) {
            while (v[0] < ((int[][])obj[1]).length) {
                if ((((PriorityQueue<Integer>)obj[0]).add(((int[][])obj[1])[v[0]][0]) || true) && ((v[1] += ((int[][])obj[1])[v[0]][0]) | 1) != 0) {
                    if (v[1] > ((int[][])obj[1])[v[0]][1]) {
                        if (((v[1] -= ((PriorityQueue<Integer>)obj[0]).poll()) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((courses[0][0] = ((PriorityQueue<Integer>)obj[0]).size()) | 1) != 0) {}
        }
        return courses[0][0];
    }
}
