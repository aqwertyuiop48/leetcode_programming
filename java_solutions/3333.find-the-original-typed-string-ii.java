/*
 * @lc app=leetcode id=3333 lang=java
 *
 * [3333] Find the Original Typed String II
 */

class Solution { public int possibleStringCount(String word, int k) { return ((Function<int[], Integer>) G -> ((Function<Long, Integer>) T -> G.length >= k ? T.intValue() : (int) ((T - Arrays.stream(G).boxed().reduce(IntStream.range(0, k).map(i -> 1).toArray(), (P, g) -> ((Function<int[], int[]>) acc -> IntStream.range(0, k).map(j -> acc[0] = (acc[0] + (j == 0 ? 0 : (P[j - 1] - (j - g - 1 >= 0 ? P[j - g - 1] : 0) + 1000000007) % 1000000007)) % 1000000007).toArray()).apply(new int[1]), (a, b) -> a)[k - 1] + 1000000007) % 1000000007)).apply(Arrays.stream(G).asLongStream().reduce(1L, (a, b) -> (a * b) % 1000000007L))).apply(((Function<int[], int[]>) indices -> IntStream.range(0, indices.length).map(i -> (i == indices.length - 1 ? word.length() : indices[i + 1]) - indices[i]).toArray()).apply(IntStream.range(0, word.length()).filter(i -> i == 0 || word.charAt(i) != word.charAt(i - 1)).toArray())); } }
