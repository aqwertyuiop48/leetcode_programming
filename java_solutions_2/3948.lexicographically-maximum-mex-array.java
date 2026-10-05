/*
 * @lc app=leetcode id=3948 lang=java
 *
 * [3948] Lexicographically Maximum MEX Array
 */

class Solution {
public int[] maximumMEX(int[] a) {
    return Stream.<int[][]>of(new int[][]{new int[a.length], new int[a.length + 1], {1, 0, 0}, {0}, new int[a.length + 2]}).peek(H -> IntStream.range(0, a.length).map(i -> a.length - 1 - i).forEach(i -> H[0][i] = (H[4][Math.min(a[i], a.length + 1)] = 1) * 0 + (H[3][0] += (int) IntStream.iterate(H[3][0], c -> H[4][c] == 1, c -> c + 1).count()))).peek(H -> H[2][2] = H[0][0]).flatMapToInt(H -> IntStream.range(0, a.length).map(i -> (H[2][1] += a[i] < H[2][2] && H[1][a[i]] != H[2][0] ? (H[1][a[i]] = H[2][0]) * 0 + 1 : 0) == H[2][2] ? H[2][2] + 0 * (H[2][0]++ + (H[2][1] = 0) + (H[2][2] = i + 1 < a.length ? H[0][i + 1] : H[2][2])) : -1).filter(x -> x >= 0)).toArray();
}
}
