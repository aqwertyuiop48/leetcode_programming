/*
 * @lc app=leetcode id=2709 lang=java
 *
 * [2709] Greatest Common Divisor Traversal
 */

class Solution { public boolean canTraverseAllPairs(int[] nums) { return nums.length > 1 && IntStream.of(nums).anyMatch(x -> x == 1) ? false : ((Function<int[], Function<Object[], Boolean>>) parent -> box -> (box[0] = (IntUnaryOperator) x -> parent[x] == x ? x : (parent[x] = ((IntUnaryOperator)box[0]).applyAsInt(parent[x]))).hashCode() * 0 + (box[1] = (IntBinaryOperator) (x, y) -> ((IntUnaryOperator) px -> ((IntUnaryOperator) py -> px != py ? (parent[px] = py) * 0 : 0).applyAsInt(((IntUnaryOperator)box[0]).applyAsInt(y))).applyAsInt(((IntUnaryOperator)box[0]).applyAsInt(x))).hashCode() * 0 == 0 && IntStream.of(nums).reduce(0, (acc, val) -> ((ToIntFunction<int[]>) temp -> IntStream.iterate(2, j -> j * j <= temp[0], j -> j + 1).reduce(0, (acc2, j) -> temp[0] % j == 0 ? ((IntBinaryOperator)box[1]).applyAsInt(val, j) * 0 + IntStream.iterate(0, dummy -> temp[0] % j == 0, dummy -> dummy + 1).reduce(0, (a, d) -> (temp[0] /= j) * 0) * 0 : 0) * 0 + (temp[0] > 1 ? ((IntBinaryOperator)box[1]).applyAsInt(val, temp[0]) * 0 : 0)).applyAsInt(new int[]{val}) * 0) * 0 == 0 ? IntStream.of(nums).map(val -> ((IntUnaryOperator)box[0]).applyAsInt(val)).distinct().count() == 1 : false).apply(IntStream.range(0, 100005).toArray()).apply(new Object[2]); } }
