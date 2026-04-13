/*
 * @lc app=leetcode id=3729 lang=java
 *
 * [3729] Count Distinct Subarrays Divisible by K in Sorted Array
 */

class Solution {
    public long numGoodSubarrays(int[] A, int k) {
        return Stream.<Object[]>of(new Object[]{new int[]{0}, new HashMap<Integer, Long>(), new long[]{0L}, new int[]{0}})
            .peek(s -> ((Map<Integer, Long>) s[1]).put(0, 1L))
            .peek(s -> Arrays.stream(A).forEach(a -> LongStream.of(((int[]) s[0])[0] = (((int[]) s[0])[0] + a) % k)
                .peek(pre -> ((long[]) s[2])[0] += ((Map<Integer, Long>) s[1]).getOrDefault((int) pre, 0L))
                .forEach(pre -> ((Map<Integer, Long>) s[1]).put((int) pre, ((Map<Integer, Long>) s[1]).getOrDefault((int) pre, 0L) + 1L))))
            .map(s -> IntStream.generate(() -> ((int[]) s[3])[0])
                .takeWhile(i -> i < A.length)
                .map(i -> IntStream.range(i, A.length).filter(next -> A[next] != A[i]).findFirst().orElse(A.length))
                .peek(j -> IntStream.range(1, j - ((int[]) s[3])[0])
                    .filter(ll -> (1L * ll * A[((int[]) s[3])[0]]) % k == 0)
                    .forEach(ll -> ((long[]) s[2])[0] -= (j - ((int[]) s[3])[0] - ll)))
                .peek(j -> ((int[]) s[3])[0] = j)
                .count() >= 0 ? ((long[]) s[2])[0] : 0L)
            .findFirst().get();
    }
}
