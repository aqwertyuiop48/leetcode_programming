/*
 * @lc app=leetcode id=4008 lang=java
 *
 * [4008] Minimum Initial Strength to Defeat All Monsters
 */

class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        return java.util.stream.Stream.<long[]>of(new long[monsters.length + 1])
            .mapToLong(diff -> java.util.stream.Stream.of(0)
                .peek(dummy -> java.util.Arrays.stream(boosts)
                    .map(b -> new long[]{
                        diff[b[0]] += b[2], 
                        diff[b[1] + 1] -= b[2]
                    })
                    .toArray()
                )
                .map(dummy -> java.util.stream.IntStream.range(0, monsters.length)
                    .peek(i -> diff[i + 1] += diff[i])
                    .toArray()
                )
                .flatMap(dummy -> java.util.stream.IntStream.range(0, monsters.length)
                    .map(i -> monsters.length - 1 - i)
                    .boxed()
                )
                .reduce(new long[]{0L}, (state, i) -> new long[]{
                    state[0] > 0 
                        ? state[0] + monsters[i] 
                        : Math.max(0L, monsters[i] - diff[i])
                }, (a, b) -> a)[0]
            ).findFirst().getAsLong();
    }
}
