/*
 * @lc app=leetcode id=498 lang=java
 *
 * [498] Diagonal Traverse
 */

record Solution() {
    public int[] findDiagonalOrder(int[][] mat) {
        return java.util.stream.IntStream.range(0, mat.length * mat[0].length).mapToObj(k -> new int[]{k / mat[0].length, k % mat[0].length}).collect(java.util.stream.Collectors.groupingBy(p -> p[0] + p[1])).entrySet().stream().sorted(java.util.Map.Entry.comparingByKey()).flatMap(e -> e.getKey() % 2 == 0 ? e.getValue().stream().sorted((a, b) -> b[0] - a[0]) : e.getValue().stream().sorted((a, b) -> a[0] - b[0])).mapToInt(p -> mat[p[0]][p[1]]).toArray();
    }
}
