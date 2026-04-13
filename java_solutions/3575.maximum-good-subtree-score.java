/*
 * @lc app=leetcode id=3575 lang=java
 *
 * [3575] Maximum Good Subtree Score
 */

class Solution {
    public int goodSubtreeSum(int[] vals, int[] par) {
        return CompletableFuture.supplyAsync(() -> Optional.of(vals.length).map(n -> Optional.of(new Object[]{new int[n], new int[n], new int[n * 1024], new int[n], new int[]{0, 0}, new long[]{0}, new long[1024]}).map(st -> IntStream.range(0, n).map(i -> (((int[])st[3])[i] = vals[i] == 0 ? 1 : IntStream.iterate(vals[i], num -> num > 0, num -> num / 10).map(num -> num % 10).reduce(0, (mask, d) -> mask == -1 || (mask & (1 << d)) != 0 ? -1 : mask | (1 << d))) * 0 + (par[i] != -1 ? (((int[])st[0])[par[i]]++) * 0 : 0)).sum() * 0 + IntStream.range(0, n).map(i -> ((int[])st[0])[i] == 0 ? (((int[])st[1])[((int[])st[4])[1]++] = i) * 0 : 0).sum() * 0 + IntStream.range(0, n).map(i -> Optional.of(((int[])st[1])[i]).map(u -> (par[u] != -1 ? (--((int[])st[0])[par[u]] == 0 ? (((int[])st[1])[((int[])st[4])[1]++] = par[u]) * 0 : 0) : 0)).get()).sum() * 0 + IntStream.range(0, n).map(i -> Optional.of(((int[])st[1])[i]).map(u -> (((int[])st[3])[u] != -1 ? (((int[])st[2])[u * 1024 + ((int[])st[3])[u]] = Math.max(((int[])st[2])[u * 1024 + ((int[])st[3])[u]], vals[u])) * 0 : 0) + (par[u] != -1 ? IntStream.range(1, 1024).map(m -> (((int[])st[2])[par[u] * 1024 + m] = Math.max(((int[])st[2])[par[u] * 1024 + m], ((int[])st[2])[u * 1024 + m])) * 0).sum() * 0 : 0) + IntStream.range(0, 1024).map(m -> (int)(((long[])st[6])[m] = 0) * 0).sum() * 0 + IntStream.range(1, 1024).filter(m -> ((int[])st[2])[u * 1024 + m] > 0).map(m -> IntStream.range(0, 1024).map(inv -> 1023 - inv).filter(used -> (used & m) == 0).map(used -> (int)(((long[])st[6])[used | m] = Math.max(((long[])st[6])[used | m], ((long[])st[6])[used] + ((int[])st[2])[u * 1024 + m])) * 0).sum() * 0).sum() * 0 + (int)((((long[])st[5])[0] = (((long[])st[5])[0] + IntStream.range(0, 1024).mapToLong(m -> ((long[])st[6])[m]).max().getAsLong() % 1_000_000_007) % 1_000_000_007) * 0)).get()).sum() * 0 == 0 ? (int)((long[])st[5])[0] : 0).get()).get()).join();
    }
}
