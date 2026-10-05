/*
 * @lc app=leetcode id=3953 lang=java
 *
 * [3953] Maximum Score with Co-Prime Element
 */

class Solution {
public int maxScore(int[] nums, int maxVal) {
    return IntStream.of(Math.max(maxVal, Arrays.stream(nums).max().getAsInt())).map(M -> Stream.<int[][]>of(new int[5][M + 2]).peek(H -> Arrays.stream(nums).forEach(x -> H[0][x]++)).peek(H -> IntStream.rangeClosed(1, M).forEach(d -> IntStream.iterate(d, c -> c <= M, c -> c + d).forEach(c -> H[1][d] += H[0][c]))).peek(H -> IntStream.rangeClosed(2, M).forEach(i -> H[2][i] = i)).peek(H -> IntStream.rangeClosed(2, (int) Math.sqrt(M)).filter(i -> H[2][i] == i).forEach(i -> IntStream.iterate(i * i, j -> j <= M, j -> j + i).filter(j -> H[2][j] == j).forEach(j -> H[2][j] = i))).peek(H -> H[3][1] = 1).peek(H -> IntStream.rangeClosed(2, M).forEach(i -> H[3][i] = (i / H[2][i]) % H[2][i] == 0 ? 0 : -H[3][i / H[2][i]])).peek(H -> IntStream.rangeClosed(1, M).filter(d -> H[3][d] != 0).forEach(d -> IntStream.iterate(d, c -> c <= M, c -> c + d).forEach(c -> H[4][c] += H[3][d] * H[1][d]))).mapToInt(H -> IntStream.rangeClosed(1, M).filter(v -> v == 1 || H[0][v] > 0 || v <= maxVal).map(v -> v - (v == 1 ? (H[0][1] > 0 ? 0 : 1) : H[0][v] > 0 ? nums.length - H[4][v] - 1 : Math.max(nums.length - H[4][v], 1))).max().getAsInt()).sum()).sum();
}}
