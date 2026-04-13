/*
 * @lc app=leetcode id=2344 lang=java
 *
 * [2344] Minimum Deletions to Make Array Divisible
 */

class Solution { public int minOperations(int[] A, int[] numsDivide) { return ((Function<Object[], Integer>) box -> ((Function<Integer, Integer>) gcd -> ((Function<int[], Integer>) sortedA -> IntStream.range(0, sortedA.length).filter(i -> gcd % sortedA[i] == 0).findFirst().orElse(-1)).apply(Arrays.stream(A).sorted().toArray())).apply(Arrays.stream(numsDivide).reduce(((BiFunction<Integer, Integer, Integer>) (box[0] = (BiFunction<Integer, Integer, Integer>) (a, b) -> b == 0 ? a : ((BiFunction<Integer, Integer, Integer>)box[0]).apply(b, a % b)))::apply).getAsInt())).apply(new Object[1]); } }
