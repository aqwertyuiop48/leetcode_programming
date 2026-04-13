/*
 * @lc app=leetcode id=2584 lang=java
 *
 * [2584] Split the Array to Make Coprime Products
 */

class Solution { public int findValidSplit(int[] nums) { return ((Function<Map<Integer, Integer>, Integer>) right -> ((Function<Map<Integer, Integer>, Integer>) left -> ((Function<int[], Integer>) state -> ((Function<Function<Integer, IntStream>, Integer>) fact -> (Arrays.stream(nums).flatMap(n -> fact.apply(n)).map(f -> (right.merge(f, 1, Integer::sum)) * 0).sum() * 0 == 0) ? IntStream.range(0, nums.length - 1).filter(i -> fact.apply(nums[i]).map(f -> (left.merge(f, 1, Integer::sum) == 1 ? state[0]++ : 0) * 0 + (left.get(f).equals(right.get(f)) ? state[0]-- : 0) * 0).sum() * 0 == 0 && state[0] == 0).findFirst().orElse(-1) : -1).apply(val -> ((Function<int[], IntStream>) n -> IntStream.concat(IntStream.iterate(2, i -> i < 1000 && n[0] > 1, i -> i + 1 + (i % 2)).filter(i -> n[0] % i == 0 && (n[0] = IntStream.iterate(n[0], x -> x % i == 0 ? x / i : 0).filter(x -> x % i != 0).findFirst().orElse(0)) > -1), IntStream.generate(() -> n[0]).limit(1).filter(x -> x > 1))).apply(new int[]{val}))).apply(new int[1])).apply(new HashMap<>())).apply(new HashMap<>()); } }
