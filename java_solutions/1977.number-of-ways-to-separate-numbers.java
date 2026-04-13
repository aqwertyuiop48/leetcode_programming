/*
 * @lc app=leetcode id=1977 lang=java
 *
 * [1977] Number of Ways to Separate Numbers
 */

class Solution {
    public int numberOfCombinations(String num) {
        return num.charAt(0) == '0' ? 0 : ((Function<Object[], Integer>) state -> 
            IntStream.iterate(num.length() * num.length() - 1, idx -> idx >= 0, idx -> idx - 1).reduce(0, (acc, idx) -> 
                ((IntUnaryOperator) i -> 
                    ((IntUnaryOperator) j -> 
                        (((int[][])state[0])[i][j] = num.charAt(i) == num.charAt(j) ? 1 + (i + 1 < num.length() && j + 1 < num.length() ? ((int[][])state[0])[i+1][j+1] : 0) : 0) * 0
                    ).applyAsInt(idx % num.length())
                ).applyAsInt(idx / num.length())
            ) * 0 == 0 &&
            IntStream.range(0, num.length() * num.length()).reduce(0, (acc, idx) -> 
                ((IntUnaryOperator) i -> 
                    ((IntUnaryOperator) len -> 
                        len > i + 1 ? (((int[][])state[1])[i][len] = ((int[][])state[1])[i][i + 1]) * 0 :
                        (((int[][])state[1])[i][len] = ((int[][])state[1])[i][len - 1]) * 0 +
                        ((IntUnaryOperator) start -> 
                            num.charAt(start) == '0' ? 0 :
                            start == 0 ? (((int[][])state[1])[i][len] = (((int[][])state[1])[i][len] + 1) % 1000000007) * 0 :
                            ((IntUnaryOperator) pml -> 
                                (((int[][])state[1])[i][len] = (((int[][])state[1])[i][len] + ((int[][])state[1])[start - 1][pml]) % 1000000007) * 0
                            ).applyAsInt(start < len ? start : (((int[][])state[0])[start - len][start] < len && num.charAt(start - len + ((int[][])state[0])[start - len][start]) > num.charAt(start + ((int[][])state[0])[start - len][start])) ? len - 1 : len)
                        ).applyAsInt(i - len + 1)
                    ).applyAsInt(idx % num.length() + 1)
                ).applyAsInt(idx / num.length())
            ) * 0 == 0 ? ((int[][])state[1])[num.length() - 1][num.length()] : 0
        ).apply(new Object[]{ new int[num.length()][num.length()], new int[num.length()][num.length() + 1] });
    }
}
