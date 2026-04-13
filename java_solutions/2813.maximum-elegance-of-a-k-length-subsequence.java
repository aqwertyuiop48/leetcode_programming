/*
 * @lc app=leetcode id=2813 lang=java
 *
 * [2813] Maximum Elegance of a K-Length Subsequence
 */

class Solution { public long findMaximumElegance(int[][] A, int k) { return ((Function<int[][], Long>) sorted -> ((Function<long[], Long>) state -> ((Function<int[], Long>) seen -> ((Function<int[], Long>) dup -> IntStream.range(0, sorted.length).mapToLong(i -> (i < k ? (state[0] += sorted[i][0]) * 0L + (seen[sorted[i][1]] == 1 ? (dup[(int)state[2]++] = sorted[i][0]) * 0L : (seen[sorted[i][1]] = 1) * 0L + state[1]++) * 0L : (seen[sorted[i][1]] == 0 && state[2] > 0 ? (seen[sorted[i][1]] = 1) * 0L + state[1]++ * 0L + (state[0] += sorted[i][0] - dup[(int)--state[2]]) * 0L : 0L)) * 0L + (state[3] = Math.max(state[3], state[0] + state[1] * state[1])) * 0L).sum() * 0L == 0L ? state[3] : 0L).apply(new int[k + 1])).apply(new int[sorted.length + 1])).apply(new long[4])).apply(Arrays.stream(A).sorted((a, b) -> Integer.compare(b[0], a[0])).toArray(int[][]::new)); } }
