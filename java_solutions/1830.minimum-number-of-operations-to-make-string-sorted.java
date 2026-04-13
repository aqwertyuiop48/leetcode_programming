/*
 * @lc app=leetcode id=1830 lang=java
 *
 * [1830] Minimum Number of Operations to Make String Sorted
 */

class Solution {
    public int makeStringSorted(String s) {
        return Optional.of(new Object[]{new long[3005], new int[26], new BiFunction[1]})
            .map((Object[] args) -> Stream.of(1)
                .peek(dummy -> ((BiFunction[])args[2])[0] = (base, exp) -> (Long)exp == 0 ? 1L : (Long)exp % 2 == 0 ? (Long)((BiFunction[])args[2])[0].apply(((Long)base * (Long)base) % 1000000007L, (Long)exp / 2) : ((Long)base * (Long)((BiFunction[])args[2])[0].apply(((Long)base * (Long)base) % 1000000007L, (Long)exp / 2)) % 1000000007L)
                .peek(dummy -> IntStream.range(0, s.length() + 1).forEach(i -> ((long[])args[0])[i] = i == 0 ? 1L : (((long[])args[0])[i - 1] * i) % 1000000007L))
                .map(dummy -> IntStream.range(0, s.length())
                    .map(idx -> s.length() - 1 - idx)
                    .mapToObj(i -> Optional.of(s.charAt(i) - 'a')
                        .map(c -> Stream.of(1)
                            .peek(d -> ((int[])args[1])[c]++)
                            .map(d -> IntStream.range(0, c).mapToLong(j -> ((int[])args[1])[j]).sum() * ((long[])args[0])[s.length() - 1 - i] % 1000000007L * (Long)((BiFunction[])args[2])[0].apply(IntStream.range(0, 26).mapToLong(j -> ((long[])args[0])[((int[])args[1])[j]]).reduce(1L, (a, b) -> (a * b) % 1000000007L), 1000000007L - 2) % 1000000007L)
                            .findFirst().orElse(0L)
                        ).orElse(0L)
                    )
                    .reduce(0L, (Long a, Long b) -> (a + b) % 1000000007L)
                )
                .findFirst().orElse(0L)
            ).get().intValue();
    }
}
