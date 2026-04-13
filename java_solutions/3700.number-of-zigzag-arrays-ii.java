/*
 * @lc app=leetcode id=3700 lang=java
 *
 * [3700] Number of ZigZag Arrays II
 */

class Solution {
    public int zigZagArrays(int n, int l, int r) {
        return n == 1 ? r - l + 1 : (int)(long) Optional.of(new Object[]{r - l + 1, 2 * (r - l + 1), new long[2 * (r - l + 1)][2 * (r - l + 1)], new long[2 * (r - l + 1)][2 * (r - l + 1)], new int[]{n - 1}, new BinaryOperator[1]}).map((Object[] st) -> IntStream.range(0, (int)st[1]).map(i -> (int)(((long[][])st[3])[i][i] = 1) * 0).sum() == 0 ? st : st).map((Object[] st) -> IntStream.range(0, (int)st[0]).map(i -> IntStream.range(0, i).map(j -> (int)(((long[][])st[2])[i][j + (int)st[0]] = 1) * 0).sum() * 0 + IntStream.range(i + 1, (int)st[0]).map(j -> (int)(((long[][])st[2])[i + (int)st[0]][j] = 1) * 0).sum() * 0).sum() == 0 ? st : st).map((Object[] st) -> (((BinaryOperator<long[][]>[])st[5])[0] = (BinaryOperator<long[][]>) (a, b) -> Optional.of(new long[(int)st[1]][(int)st[1]]).map(c -> IntStream.range(0, (int)st[1]).map(i -> IntStream.range(0, (int)st[1]).filter(k -> a[i][k] != 0).map(k -> IntStream.range(0, (int)st[1]).map(j -> (int)(c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % 1000000007) * 0).sum() * 0).sum() * 0).sum() == 0 ? c : c).get()) != null ? st : st).map((Object[] st) -> IntStream.range(0, 31).filter(bit -> (((int[])st[4])[0] >> bit) > 0).map(bit -> (st[3] = ((((int[])st[4])[0] & (1 << bit)) != 0) ? ((BinaryOperator<long[][]>[])st[5])[0].apply((long[][])st[3], (long[][])st[2]) : st[3]).hashCode() * 0 + (st[2] = ((BinaryOperator<long[][]>[])st[5])[0].apply((long[][])st[2], (long[][])st[2])).hashCode() * 0).sum() == 0 ? st : st).map((Object[] st) -> IntStream.range(0, (int)st[1]).mapToLong(i -> IntStream.range(0, (int)st[1]).mapToLong(j -> ((long[][])st[3])[i][j]).sum() % 1000000007).sum() % 1000000007).get();
    }
}
