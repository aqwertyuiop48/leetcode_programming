/*
 * @lc app=leetcode id=3725 lang=java
 *
 * [3725] Count Ways to Choose Coprime Integers from Rows
 */

class Solution {
    public int countCoprime(int[][] mat) {
        return Stream.<Object[]>of(new Object[]{new HashMap<Integer, Integer>(Map.of(0, 1)), null})
            .peek(s -> s[1] = (BiFunction<Integer, Integer, Integer>) (a, b) -> b == 0 ? a : ((BiFunction<Integer, Integer, Integer>) s[1]).apply(b, a % b))
            .peek(s -> Arrays.stream(mat).forEach(row -> Stream.of(new HashMap<Integer, Integer>())
                .peek(nxt -> Arrays.stream(row).forEach(a -> ((Map<Integer, Integer>) s[0]).forEach((key, val) -> 
                    nxt.put(((BiFunction<Integer, Integer, Integer>) s[1]).apply(a, key), 
                    (nxt.getOrDefault(((BiFunction<Integer, Integer, Integer>) s[1]).apply(a, key), 0) + val) % 1000000007))))
                .forEach(nxt -> s[0] = nxt)))
            .mapToInt(s -> ((Map<Integer, Integer>) s[0]).getOrDefault(1, 0))
            .findFirst().getAsInt();
    }
}
