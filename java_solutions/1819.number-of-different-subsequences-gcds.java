/*
 * @lc app=leetcode id=1819 lang=java
 *
 * [1819] Number of Different Subsequences GCDs
 */

class Solution {
    public int countDifferentSubsequenceGCDs(int[] nums) {
        return Optional.of(new Object[]{
            new boolean[200005], 
            Arrays.stream(nums).max().orElse(0), 
            new BiFunction[1]
        })
        .map((Object[] args) -> Stream.of(1)
            .peek(dummy -> Arrays.stream(nums).forEach(n -> ((boolean[])args[0])[n] = true))
            .peek(dummy -> ((BiFunction[])args[2])[0] = (a, b) -> (Integer)a == 0 ? (Integer)b : (Integer)((BiFunction[])args[2])[0].apply((Integer)b % (Integer)a, (Integer)a))
            .map(dummy -> IntStream.rangeClosed(1, (int)args[1])
                .filter(i -> IntStream.iterate(i, j -> j <= (int)args[1], j -> j + i)
                    .filter(j -> ((boolean[])args[0])[j])
                    .reduce(0, (int val, int j) -> (Integer)((BiFunction[])args[2])[0].apply(val, j)) == i
                ).count()
            )
            .findFirst().orElse(0L)
        ).get().intValue();
    }
}
