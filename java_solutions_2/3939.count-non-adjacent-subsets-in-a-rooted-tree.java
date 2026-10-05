/*
 * @lc app=leetcode id=3939 lang=java
 *
 * [3939] Count Non Adjacent Subsets in a Rooted Tree
 */

class Solution {
public int countValidSubsets(int[] parent, int[] nums, int k) {
    return IntStream.of(parent.length).map(n -> Stream.<int[][]>of(new int[][]{new int[n], new int[n], new int[n], {1}}).peek(H -> Arrays.fill(H[0], -1)).peek(H -> IntStream.range(1, n).forEach(i -> H[1][i] = H[0][parent[i]] + 0 * (H[0][parent[i]] = i))).peek(H -> IntStream.range(0, n).forEach(p -> IntStream.iterate(H[0][H[2][p]], e -> e != -1, e -> H[1][e]).forEach(e -> H[2][H[3][0]++] = e))).mapToInt(H -> Stream.<long[][][]>of(new long[][][]{new long[n][k], new long[n][k]}).peek(D -> IntStream.range(0, n).forEach(u -> D[0][u][0] = D[1][u][nums[u] % k] = 1)).peek(D -> IntStream.range(1, n).map(i -> n - i).forEach(pos -> IntStream.of(H[2][pos]).forEach(v -> Stream.<long[][]>of(new long[][]{new long[k], new long[k], IntStream.range(0, k).mapToLong(b -> (D[0][v][b] + D[1][v][b]) % 1_000_000_007L).toArray()}).peek(W -> IntStream.range(0, k * k).filter(idx -> D[0][parent[v]][idx / k] != 0 && W[2][idx % k] != 0).forEach(idx -> W[0][(idx / k + idx % k) % k] = (W[0][(idx / k + idx % k) % k] + D[0][parent[v]][idx / k] * W[2][idx % k]) % 1_000_000_007L)).peek(W -> IntStream.range(0, k * k).filter(idx -> D[1][parent[v]][idx / k] != 0 && D[0][v][idx % k] != 0).forEach(idx -> W[1][(idx / k + idx % k) % k] = (W[1][(idx / k + idx % k) % k] + D[1][parent[v]][idx / k] * D[0][v][idx % k]) % 1_000_000_007L)).peek(W -> D[0][parent[v]] = W[0]).forEach(W -> D[1][parent[v]] = W[1])))).mapToInt(D -> (int) (((D[0][0][0] + D[1][0][0] - 1) % 1_000_000_007L + 1_000_000_007L) % 1_000_000_007L)).sum()).sum()).sum();
}}
