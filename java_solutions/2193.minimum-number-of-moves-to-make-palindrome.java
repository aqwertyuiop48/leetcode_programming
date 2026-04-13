/*
 * @lc app=leetcode id=2193 lang=java
 *
 * [2193] Minimum Number of Moves to Make Palindrome
 */

class Solution { public int minMovesToMakePalindrome(String s) { return ((Function<char[], Integer>) arr -> ((ToIntFunction<int[]>) state -> IntStream.iterate(0, dummy -> state[0] < state[1], dummy -> dummy + 1).reduce(0, (acc, dummy) -> arr[state[0]] == arr[state[1]] ? (state[0]++) * 0 + (state[1]--) * 0 : ((ToIntFunction<int[]>) k -> k[0] == state[0] ? ((IntUnaryOperator) swap -> (arr[state[0]] = arr[state[0]+1]) * 0 + (arr[state[0]+1] = (char)swap) * 0 + (state[2]++) * 0).applyAsInt(arr[state[0]]) : IntStream.range(k[0], state[1]).reduce(0, (acc2, j) -> ((IntUnaryOperator) swap -> (arr[j] = arr[j+1]) * 0 + (arr[j+1] = (char)swap) * 0 + (state[2]++) * 0).applyAsInt(arr[j])) * 0 + (state[0]++) * 0 + (state[1]--) * 0).applyAsInt(new int[]{IntStream.iterate(state[1], j -> j > state[0], j -> j - 1).filter(j -> arr[j] == arr[state[0]]).findFirst().orElse(state[0])}) * 0) * 0 == 0 ? state[2] : 0).applyAsInt(new int[]{0, arr.length - 1, 0})).apply(s.toCharArray()); } }
