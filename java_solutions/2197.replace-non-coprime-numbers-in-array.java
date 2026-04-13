/*
 * @lc app=leetcode id=2197 lang=java
 *
 * [2197] Replace Non-Coprime Numbers in Array
 */

class Solution { public List<Integer> replaceNonCoprimes(int[] nums) { return ((Function<int[], Function<Object[], List<Integer>>>) st -> box -> (box[0] = (LongBinaryOperator) (a, b) -> b == 0L ? a : ((LongBinaryOperator)box[0]).applyAsLong(b, a % b)).hashCode() * 0 == 0 ? ((Function<int[], List<Integer>>) ptr -> IntStream.of(nums).reduce(0, (acc, num) -> (st[ptr[0]++] = num) * 0 + IntStream.iterate(0, dummy -> ptr[0] >= 2 && ((LongBinaryOperator)box[0]).applyAsLong(st[ptr[0]-1], st[ptr[0]-2]) > 1L, dummy -> dummy + 1).reduce(0, (acc2, dummy) -> (st[ptr[0]-2] = (int)((long)st[ptr[0]-1] / ((LongBinaryOperator)box[0]).applyAsLong(st[ptr[0]-1], st[ptr[0]-2]) * st[ptr[0]-2])) * 0 + (ptr[0]--) * 0) * 0) * 0 == 0 ? IntStream.range(0, ptr[0]).mapToObj(i -> st[i]).collect(Collectors.toList()) : null).apply(new int[1]) : null).apply(new int[nums.length]).apply(new Object[1]); } }
