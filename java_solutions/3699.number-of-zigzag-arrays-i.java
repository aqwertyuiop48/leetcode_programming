/*
 * @lc app=leetcode id=3699 lang=java
 *
 * [3699] Number of ZigZag Arrays I
 */

class Solution {
    public int zigZagArrays(int n, int l, int r) {
        return Stream.<Object[]>of(new Object[]{
            IntStream.range(0, (r - l + 1)).map(i -> 1).toArray(), // s[0]: dp array
            new int[1], // s[1]: pre
            1_000_000_007, // s[2]: MOD
            r - l // s[3]: range limit
        }).map(s -> 
            IntStream.range(1, n).allMatch(i -> 
                (((int[]) s[1])[0] = 0) == 0 && (
                    (i % 2 == 1) ? 
                    IntStream.range(0, ((int[]) s[0]).length).allMatch(v -> 
                        (((int[]) s[1])[0] = (((int[]) s[1])[0] + ((int[]) s[0])[v]) % (int) s[2]) >= 0 && 
                        (((int[]) s[0])[v] = (((int[]) s[1])[0] - ((int[]) s[0])[v] + (int) s[2]) % (int) s[2]) >= 0
                    ) : 
                    IntStream.iterate(((int[]) s[0]).length - 1, v -> v >= 0, v -> v - 1).allMatch(v -> 
                        (((int[]) s[1])[0] = (((int[]) s[1])[0] + ((int[]) s[0])[v]) % (int) s[2]) >= 0 && 
                        (((int[]) s[0])[v] = (((int[]) s[1])[0] - ((int[]) s[0])[v] + (int) s[2]) % (int) s[2]) >= 0
                    )
                )
            ) ? 
            (int) (IntStream.of((int[]) s[0]).mapToLong(v -> v).sum() % (int) s[2] * 2 % (int) s[2]) : 0
        ).findFirst().get();
    }
}
