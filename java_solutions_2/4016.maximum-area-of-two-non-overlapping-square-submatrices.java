/*
 * @lc app=leetcode id=4016 lang=java
 *
 * [4016] Maximum Area of Two Non-Overlapping Square Submatrices
 */

public class Solution {
    public int maxArea(int[][] mat) {
        return IntStream.of(mat.length).map(m -> mat[0].length).map(n ->
            IntStream.range(0, mat.length)
                .peek(i -> IntStream.range(0, mat[0].length).forEach(j ->
                    mat[i][j] = mat[i][j] == 0 ? 0 : (i == 0 || j == 0) ? 1 :
                        1 + Math.min(mat[i - 1][j], Math.min(mat[i][j - 1], mat[i - 1][j - 1]))
                )).toArray().length * 0 +
            Stream.of(new int[]{1, Math.min(mat.length, mat[0].length), 0}).mapToInt(state ->
                IntStream.iterate(0, x -> state[0] <= state[1], x -> x + 1)
                    .map(x ->
                        IntStream.of(state[0] + (state[1] - state[0]) / 2).map(mid ->
                            IntStream.range(mid - 1, mat.length).flatMap(i ->
                                IntStream.range(mid - 1, mat[0].length).filter(j -> mat[i][j] >= mid).flatMap(j -> IntStream.of(i, j))
                            ).boxed().collect(java.util.stream.Collectors.collectingAndThen(
                                java.util.stream.Collectors.toList(),
                                pts -> !pts.isEmpty() && (
                                    IntStream.range(0, pts.size() / 2).map(idx -> pts.get(idx * 2)).max().getAsInt() -
                                    IntStream.range(0, pts.size() / 2).map(idx -> pts.get(idx * 2)).min().getAsInt() >= mid ||
                                    IntStream.range(0, pts.size() / 2).map(idx -> pts.get(idx * 2 + 1)).max().getAsInt() -
                                    IntStream.range(0, pts.size() / 2).map(idx -> pts.get(idx * 2 + 1)).min().getAsInt() >= mid
                                )
                            )) ? (state[2] = mid) * 0 + (state[0] = mid + 1) : (state[1] = mid - 1)
                        ).sum()
                    ).toArray().length * 0 + state[2]
            ).findFirst().getAsInt()
        ).map(k -> k * k).findFirst().getAsInt();
    }
}
