/*
 * @lc app=leetcode id=1998 lang=java
 *
 * [1998] GCD Sort of an Array
 */

class Solution { public boolean gcdSort(int[] nums) { return ((Function<int[], Function<Object[], Boolean>>) p -> box -> (box[0] = (IntUnaryOperator) x -> p[x] == 0 ? (p[x] = x) : p[x] == x ? x : (p[x] = ((IntUnaryOperator)box[0]).applyAsInt(p[x]))).hashCode() * 0 + (box[1] = (IntBinaryOperator) (x, y) -> ((IntUnaryOperator) rx -> ((IntUnaryOperator) ry -> rx != ry ? (p[rx] = ry) * 0 : 0).applyAsInt(((IntUnaryOperator)box[0]).applyAsInt(y))).applyAsInt(((IntUnaryOperator)box[0]).applyAsInt(x))).hashCode() * 0 == 0 && IntStream.of(nums).reduce(0, (acc, x) -> ((ToIntFunction<int[]>) temp -> IntStream.iterate(2, j -> j * j <= temp[0], j -> j + 1).reduce(0, (a, j) -> temp[0] % j == 0 ? ((IntBinaryOperator)box[1]).applyAsInt(x, j) * 0 + IntStream.iterate(0, dummy -> temp[0] % j == 0, dummy -> dummy + 1).reduce(0, (a2, d) -> (temp[0] /= j) * 0) * 0 : 0) * 0 + (temp[0] > 1 ? ((IntBinaryOperator)box[1]).applyAsInt(x, temp[0]) * 0 : 0)).applyAsInt(new int[]{x}) * 0) * 0 == 0 ? ((Function<int[], Boolean>) sorted -> IntStream.range(0, nums.length).allMatch(i -> nums[i] == sorted[i] || ((IntUnaryOperator)box[0]).applyAsInt(nums[i]) == ((IntUnaryOperator)box[0]).applyAsInt(sorted[i]))).apply(IntStream.of(nums).sorted().toArray()) : false).apply(new int[100005]).apply(new Object[2]); } }
