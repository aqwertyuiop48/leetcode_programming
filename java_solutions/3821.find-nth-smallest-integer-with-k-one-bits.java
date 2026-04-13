/*
 * @lc app=leetcode id=3821 lang=java
 *
 * [3821] Find Nth Smallest Integer With K One Bits
 */

class Solution {
    public long nthSmallest(long n, int k) {
        return CompletableFuture.supplyAsync(() -> Optional.of(new long[51][51]).map(comb -> Optional.of(new long[]{n, k, 0}).map(state -> IntStream.rangeClosed(0, 50).mapToLong(i -> (comb[i][0] = 1) * 0L + IntStream.rangeClosed(1, i).mapToLong(j -> (comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j]) * 0L).sum()).sum() * 0L + IntStream.range(0, 50).map(inv -> 49 - inv).mapToLong(i -> state[1] == 0 ? 0L : (state[0] > comb[i][(int)state[1]] ? (state[2] |= (1L << i)) * 0L + (state[0] -= comb[i][(int)state[1]]) * 0L + (state[1]--) * 0L : 0L)).sum() * 0L + state[2]).get()).get()).join();
    }
}
