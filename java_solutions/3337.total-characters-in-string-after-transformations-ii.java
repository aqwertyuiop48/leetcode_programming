/*
 * @lc app=leetcode id=3337 lang=java
 *
 * [3337] Total Characters in String After Transformations II
 */

class Solution { public int lengthAfterTransformations(String s, int t, List<Integer> nums) { return ((Function<BinaryOperator<long[][]>, Integer>) mul -> ((Function<long[][], Integer>) M -> ((Function<long[][], Integer>) Mt -> (int) s.chars().mapToLong(c -> Arrays.stream(Mt[c - 'a']).reduce(0L, (acc, val) -> (acc + val) % 1000000007L)).reduce(0L, (acc, val) -> (acc + val) % 1000000007L)).apply(Integer.toBinaryString(t).chars().boxed().reduce(IntStream.range(0, 26).mapToObj(i -> IntStream.range(0, 26).mapToLong(j -> i == j ? 1L : 0L).toArray()).toArray(long[][]::new), (res, bit) -> bit == '1' ? mul.apply(mul.apply(res, res), M) : mul.apply(res, res), (a, b) -> a))).apply(IntStream.range(0, 26).mapToObj(i -> IntStream.range(0, 26).mapToLong(j -> (j - i + 25) % 26 + 1 <= nums.get(i) ? 1L : 0L).toArray()).toArray(long[][]::new))).apply((A, B) -> IntStream.range(0, 26).mapToObj(i -> IntStream.range(0, 26).mapToLong(j -> IntStream.range(0, 26).mapToLong(k -> (A[i][k] * B[k][j]) % 1000000007L).reduce(0L, (acc, val) -> (acc + val) % 1000000007L)).toArray()).toArray(long[][]::new)); } }
