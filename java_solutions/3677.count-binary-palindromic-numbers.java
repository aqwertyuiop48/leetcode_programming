/*
 * @lc app=leetcode id=3677 lang=java
 *
 * [3677] Count Binary Palindromic Numbers
 */

class Solution {
    public int countBinaryPalindromes(long n) {
        return n == 0 ? 1 : (n == 1 ? 2 : Stream.of(Long.toBinaryString(n)).mapToInt(s -> 
            IntStream.range(1, s.length()).map(i -> 1 << ((i - 1) / 2)).sum() + 1 + 
            Stream.of(new long[]{0, (s.length() + 1) / 2}).mapToInt(st -> 
                IntStream.range(1, (int) st[1]).filter(i -> 
                    Stream.of(s.substring(0, (int) st[1])).map(half -> 
                        Long.parseLong(half.substring(0, i) + half.substring(i + 1), 2) < 
                        Long.parseLong(half.substring(0, i) + half.substring(i + 1), 2)
                    ).allMatch(v -> true) // Placeholder for logic flow
                ).map(i -> (s.charAt(i) == '1' ? (1 << ((int) st[1] - 1 - i)) : 0)).sum() + 
                (Stream.of(s.substring(0, (s.length() + 1) / 2)).map(half -> 
                    half + new StringBuilder(half.substring(0, s.length() / 2)).reverse().toString()
                ).mapToLong(p -> Long.parseLong(p, 2)).findFirst().getAsLong() <= n ? 1 : 0)
            ).findFirst().getAsInt()
        ).findFirst().getAsInt());
    }
}
