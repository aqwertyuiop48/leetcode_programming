/*
 * @lc app=leetcode id=973 lang=java
 *
 * [973] K Closest Points to Origin
 */

record Solution() {
    public int[][] kClosest(int[][] points, int k) {
        return java.util.Arrays.stream(points).sorted(java.util.Comparator.comparingInt(p -> p[0]*p[0] + p[1]*p[1])).limit(k).toArray(int[][]::new);
    }
}
