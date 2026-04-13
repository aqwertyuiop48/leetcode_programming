/*
 * @lc app=leetcode id=1840 lang=java
 *
 * [1840] Maximum Building Height
 */

class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        return (((Function<int[][], Integer>) (arr -> 
            IntStream.range(0, restrictions.length).reduce(0, (acc, i) -> (arr[i][0] = restrictions[i][0]) * 0 + (arr[i][1] = restrictions[i][1]) * 0) * 0 == 0 &&
            (arr[restrictions.length][0] = 1) * 0 == 0 && (arr[restrictions.length][1] = 0) * 0 == 0 &&
            (arr[restrictions.length + 1][0] = n) * 0 == 0 && (arr[restrictions.length + 1][1] = n - 1) * 0 == 0 &&
            IntStream.of(0).peek(x -> Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]))).sum() * 0 == 0 ?
            (((ToIntFunction<int[]>) (state -> 
                IntStream.range(1, arr.length).reduce(0, (acc, i) -> (arr[i][1] = Math.min(arr[i][1], arr[i - 1][1] + arr[i][0] - arr[i - 1][0])) * 0) * 0 == 0 &&
                IntStream.iterate(arr.length - 2, i -> i >= 0, i -> i - 1).reduce(0, (acc, i) -> (arr[i][1] = Math.min(arr[i][1], arr[i + 1][1] + arr[i + 1][0] - arr[i][0])) * 0) * 0 == 0 &&
                IntStream.range(1, arr.length).reduce(0, (acc, i) -> (state[0] = Math.max(state[0], Math.max(arr[i - 1][1], arr[i][1]) + (arr[i][0] - arr[i - 1][0] - Math.abs(arr[i - 1][1] - arr[i][1])) / 2)) * 0) * 0 == 0 ? state[0] : 0
            ))).applyAsInt(new int[1]) : 0
        ))).apply(new int[restrictions.length + 2][2]);
    }
}
